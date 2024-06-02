package org.example.models.odds;

public class Choice {
        public String initialFractionalValue;
        public String fractionalValue;
        public int sourceId;
        public String name;
        public int change;

    public Choice() {
    }

    public Choice(String initialFractionalValue, String fractionalValue, int sourceId, String name, int change) {
        this.initialFractionalValue = initialFractionalValue;
        this.fractionalValue = fractionalValue;
        this.sourceId = sourceId;
        this.name = name;
        this.change = change;
    }

    public String getInitialFractionalValue() {
        return initialFractionalValue;
    }

    public void setInitialFractionalValue(String initialFractionalValue) {
        this.initialFractionalValue = initialFractionalValue;
    }

    public String getFractionalValue() {
        return fractionalValue;
    }

    public void setFractionalValue(String fractionalValue) {
        this.fractionalValue = fractionalValue;
    }

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }

    @Override
    public String toString() {
        return "Choice{" +
                "initialFractionalValue='" + initialFractionalValue + '\'' +
                ", fractionalValue='" + fractionalValue + '\'' +
                ", sourceId=" + sourceId +
                ", name='" + name + '\'' +
                ", change=" + change +
                '}';
    }
}
