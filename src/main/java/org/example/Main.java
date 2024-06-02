package org.example;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.models.Event;
import org.example.models.odds.Choice;
import org.example.models.odds.Market;
import org.example.models.odds.Odds;
import org.example.models.odds.Root;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;


import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<EventDTO> eventsList = new ArrayList<>();
//        String date = "2024-05-11";

        String date = args[0].trim();
        try {
            System.out.println("pobieranie danych...");
            URL url = new URL("https://www.sofascore.com/api/v1/sport/football/scheduled-events/" + date);
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            Events events = mapper.readValue(url, Events.class);

            OddsCollection oddsCollection = new OddsCollection();

            System.out.println("przetwarzanie danych...");
            for (Event event : events.getEvents()) {

                try {
                    URL oddsUrl = new URL("https://www.sofascore.com/api/v1/event/" + event.getId() + "/odds/1/all");
                    ObjectMapper oddsMapper = new ObjectMapper();
                    oddsMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                    Root odds = oddsMapper.readValue(oddsUrl, Root.class);
                    oddsCollection.oddsMap.put(odds.eventId, odds);
//                            oddsCollection.getOddsList().add(odds);
//                            System.out.println(odds);
                } catch (FileNotFoundException e) {
                    // Ignorujemy wyjątek FileNotFoundException
//                            System.out.println("Wyjątek FileNotFoundException: " + e.getMessage());
                } catch (IOException e) {
                    // Obsługa innych błędów wejścia/wyjścia
//                    e.printStackTrace();
                }
            }
            System.out.println("zapis danych...");
            for (Event event : events.getEvents()) {
                EventDTO eventDTO = new EventDTO();
                eventDTO.setId(event.getId());
                eventDTO.setLiga(event.getTournament().getName());
                eventDTO.setGospodarz(event.getHomeTeam().getName());
                eventDTO.setGosc(event.getAwayTeam().getName());
                eventDTO.setStatusCode(event.getStatus().getCode());
                eventDTO.setKraj(event.getTournament().getCategory().getName());

                if(event.getHomeScore()!=null && event.getAwayScore()!=null){
                    eventDTO.setHomeScore(event.getHomeScore().getCurrent());
                    eventDTO.setAwayScore(event.getAwayScore().getCurrent());
                }

                LocalDateTime dataMeczu = LocalDateTime.ofInstant(Instant.ofEpochSecond(event.startTimestamp), ZoneId.of("Europe/Warsaw"));

//                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

                eventDTO.setDataMeczu(dataMeczu.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                eventDTO.setGodzinaMeczu(dataMeczu.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

                Root root = oddsCollection.oddsMap.get(event.getId());
                if (root != null) {
                    List<Market> markets = root.getMarkets();
                    if (!markets.isEmpty()) {
                        boolean hasMoreOdds = false;
                        for (Market m : markets) {
                            if (m.getMarketName().equals("Match goals") && m.getChoiceGroup().equals("2.5")) {
                                hasMoreOdds = true;
                                for (Choice c : m.getChoices()) {
                                    if (c.getName().equals("Over")) {
                                        String str = c.getFractionalValue();
                                        String[] strings = str.split("/");
                                        int left = Integer.parseInt(strings[0]);
                                        int right = Integer.parseInt(strings[1]);

                                        if (left != 0 && right != 0) {
//                                            System.out.println(left + " / " + right);
                                            double kurs = 1 + 1 / ((double) right / left);

//                                            double kurs = 1 + 1 / (right / left);
//
                                            eventDTO.setKursOver(Math.round(kurs * 100.0) / 100.0);
                                        }

                                    } else if (c.getName().equals("Under")) {
                                        String str = c.getFractionalValue();
                                        String[] strings = str.split("/");
                                        int left = Integer.parseInt(strings[0]);
                                        int right = Integer.parseInt(strings[1]);

                                        if (left != 0 && right != 0) {

//                                            System.out.println(left + " / " + right);
                                            double kurs = 1 + 1 / ((double) right / left);

//                                            double kurs = 1 + 1 / (right / left);

                                            eventDTO.setKursUnder(Math.round(kurs * 100.0) / 100.0);

                                        }

                                    }
                                }
                            }
                        }

                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");



                        String dataMeczuPorownaj = eventDTO.getDataMeczu();
                        if(hasMoreOdds && eventDTO.getDataMeczu().equals(date)) {
                            eventsList.add(eventDTO);
                        }
//                eventDTO.setKursOver(root.getMarkets());
                    } else {
//                        System.out.println("markets is empty");
                    }
                } else {
//                    System.out.println("root is null");
                }
            }
//                eventsList.sort(Comparator.comparing(EventDTO::getGodzinaMeczu));
//            for (EventDTO e : eventsList) {
////                System.out.println(e);
//            }

//            System.out.println(oddsCollection);
        } catch (Exception e) {
//            e.printStackTrace();
        }

        String filePath = date + ".xlsx";

        try {
            exportToExcel(eventsList, filePath);
            System.out.println("Exported successfully to " + filePath);
        } catch (IOException e) {
            System.out.println("Export failed: " + e.getMessage());
            e.printStackTrace();
        }


    }
    public static void exportToExcel(List<EventDTO> events, String filePath) throws IOException {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Events");

            String[] headers = {"ID", "League", "Country", "Home Team", "Away Team", "Match Date", "Start Time", "Over Odds", "Under Odds", "Status Code", "Home Score", "Away Score"};
            Row headerRow = sheet.createRow(0);
            for (int i = 0; i < headers.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(headers[i]);
            }

            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            int rowNum = 1;
            for (EventDTO event : events) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(event.getId());
                row.createCell(1).setCellValue(event.getLiga());
                row.createCell(2).setCellValue(event.getKraj());
                row.createCell(3).setCellValue(event.getGospodarz());
                row.createCell(4).setCellValue(event.getGosc());
                row.createCell(5).setCellValue(event.getDataMeczu());
                row.createCell(6).setCellValue(event.getGodzinaMeczu());
                row.createCell(7).setCellValue(event.getKursOver());
                row.createCell(8).setCellValue(event.getKursUnder());
                row.createCell(9).setCellValue(event.getStatusCode());
                row.createCell(10).setCellValue(event.getHomeScore());
                row.createCell(11).setCellValue(event.getAwayScore());
            }

            // Zapis arkusza do pliku
            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
            }
        }
    }















































//
//
//
//            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//            ChromeOptions ops = new ChromeOptions();
//            ops.addArguments("--remote-allow-origins=*");
//            ops.addArguments("--start-maximized");
//
//            // Inicjalizacja przeglądarki Chrome
//            WebDriver driver = new ChromeDriver(ops);
//
//            // Navigacja do strony
//            driver.get(url);
//
//            WebDriverWait wait = new WebDriverWait(driver, 10);
//
//            // Pobranie źródła strony po wykonaniu JavaScript
//        WebElement acceptCookiesButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'Zgadzam się')]")));
//        acceptCookiesButton.click();
//
////            WebElement showAllMatchesButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Pokaż wszystkie mecze')]")));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[data-id='11390056']")));
//
////        showAllMatchesButton.click();
//        System.out.println(driver.getPageSource());
//
//            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[elevation=',2'].Box.dTbAOG")));
//
//
//        List<WebElement> matchesList = element.findElements(By.cssSelector("div.Box.klGMtt"));
//
//        // Przetwarzaj i wyświetl listę
//        for (WebElement match : matchesList) {
////            List<WebElement> nestedDivs = match.findElements(By.cssSelector("div[class*='Box'] > div[class*='Flex'][class*='hqpLOB'][class*='jLRkRA']"));
//            List<WebElement> nestedDivs = match.findElements(By.cssSelector("div.Box.GKBRj"));
//
//            // Sprawdź, czy znaleziono jakiekolwiek zagnieżdżone divy
//            if (!nestedDivs.isEmpty()) {
//                // Znaleziono zagnieżdżone divy o odpowiednich klasach
////                System.out.println(match.getAttribute("outerHTML"));
////                System.out.println("Znaleziono zagnieżdżone divy.");
////                System.out.println(match.getText());
//            } else {
//                // Nie znaleziono zagnieżdżonych divów o odpowiednich klasach
////                System.out.println(match.getAttribute("outerHTML"));
////                System.out.println("Nie znaleziono zagnieżdżonych divów.");
//            }
//        }
//        driver.close();
//    }
}
