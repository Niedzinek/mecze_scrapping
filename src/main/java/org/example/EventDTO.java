package org.example;

import java.time.LocalDateTime;
import java.util.Date;

public class EventDTO {
    public Integer id;
    public String liga;
    public String kraj;
    public String gospodarz;
    public String gosc;
    public String dataMeczu;
    public String godzinaMeczu;
    public double kursOver;
    public double kursUnder;
    public int statusCode;
    public int homeScore;
    public int awayScore;

    public EventDTO() {
    }


    public String getDataMeczu() {
        return dataMeczu;
    }

    public void setDataMeczu(String dataMeczu) {
        this.dataMeczu = dataMeczu;
    }

    public String getGodzinaMeczu() {
        return godzinaMeczu;
    }

    public void setGodzinaMeczu(String godzinaMeczu) {
        this.godzinaMeczu = godzinaMeczu;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public String getGospodarz() {
        return gospodarz;
    }

    public void setGospodarz(String gospodarz) {
        this.gospodarz = gospodarz;
    }

    public String getGosc() {
        return gosc;
    }

    public void setGosc(String gosc) {
        this.gosc = gosc;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public double getKursOver() {
        return kursOver;
    }

    public void setKursOver(double kursOver) {
        this.kursOver = kursOver;
    }

    public double getKursUnder() {
        return kursUnder;
    }

    public void setKursUnder(double kursUnder) {
        this.kursUnder = kursUnder;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    @Override
    public String toString() {
        return "EventDTO{" +
                "id=" + id +
                ", liga='" + liga + '\'' +
                ", kraj='" + kraj + '\'' +
                ", gospodarz='" + gospodarz + '\'' +
                ", gosc='" + gosc + '\'' +
                ", dataMeczu=" + dataMeczu +
                ", godzinaMeczu=" + godzinaMeczu +
                ", kursOver=" + kursOver +
                ", kursUnder=" + kursUnder +
                ", statusCode=" + statusCode +
                ", homeScore=" + homeScore +
                ", awayScore=" + awayScore +
                '}';
    }
}
