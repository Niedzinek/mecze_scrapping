package org.example.models;

public class TeamColors{
    public String primary;
    public String secondary;
    public String text;

    public TeamColors() {
    }

    public TeamColors(String primary, String secondary, String text) {
        this.primary = primary;
        this.secondary = secondary;
        this.text = text;
    }

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public String getSecondary() {
        return secondary;
    }

    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "TeamColors{" +
                "primary='" + primary + '\'' +
                ", secondary='" + secondary + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
