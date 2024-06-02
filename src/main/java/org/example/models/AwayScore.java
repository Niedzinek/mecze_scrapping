package org.example.models;

public class AwayScore{
    public int current;
    public int display;
    public int period1;
    public int period2;
    public int normaltime;

    public AwayScore() {
    }

    public AwayScore(int current, int display, int period1, int period2, int normaltime) {
        this.current = current;
        this.display = display;
        this.period1 = period1;
        this.period2 = period2;
        this.normaltime = normaltime;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getDisplay() {
        return display;
    }

    public void setDisplay(int display) {
        this.display = display;
    }

    public int getPeriod1() {
        return period1;
    }

    public void setPeriod1(int period1) {
        this.period1 = period1;
    }

    public int getPeriod2() {
        return period2;
    }

    public void setPeriod2(int period2) {
        this.period2 = period2;
    }

    public int getNormaltime() {
        return normaltime;
    }

    public void setNormaltime(int normaltime) {
        this.normaltime = normaltime;
    }

    @Override
    public String toString() {
        return "AwayScore{" +
                "current=" + current +
                ", display=" + display +
                ", period1=" + period1 +
                ", period2=" + period2 +
                ", normaltime=" + normaltime +
                '}';
    }
}
