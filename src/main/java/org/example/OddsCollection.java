package org.example;

import org.example.models.odds.Odds;
import org.example.models.odds.Root;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OddsCollection {
    public List<Root> oddsList = new ArrayList<>();
    public Map<Integer, Root> oddsMap = new HashMap<>();

    public OddsCollection() {
    }

    public OddsCollection(List<Root> oddsList) {
        this.oddsList = oddsList;
    }

    public List<Root> getOddsList() {
        return oddsList;
    }

    public void setOddsList(List<Root> oddsList) {
        this.oddsList = oddsList;
    }

    @Override
    public String toString() {
        return "OddsCollection{" +
                "oddsList=" + oddsList +
                '}';
    }
}
