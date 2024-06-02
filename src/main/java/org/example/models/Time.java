package org.example.models;

public class Time{
    public int injuryTime1;
    public int injuryTime2;
    public int currentPeriodStartTimestamp;

    public Time() {
    }

    public Time(int injuryTime1, int injuryTime2, int currentPeriodStartTimestamp) {
        this.injuryTime1 = injuryTime1;
        this.injuryTime2 = injuryTime2;
        this.currentPeriodStartTimestamp = currentPeriodStartTimestamp;
    }

    public int getInjuryTime1() {
        return injuryTime1;
    }

    public void setInjuryTime1(int injuryTime1) {
        this.injuryTime1 = injuryTime1;
    }

    public int getInjuryTime2() {
        return injuryTime2;
    }

    public void setInjuryTime2(int injuryTime2) {
        this.injuryTime2 = injuryTime2;
    }

    public int getCurrentPeriodStartTimestamp() {
        return currentPeriodStartTimestamp;
    }

    public void setCurrentPeriodStartTimestamp(int currentPeriodStartTimestamp) {
        this.currentPeriodStartTimestamp = currentPeriodStartTimestamp;
    }

    @Override
    public String toString() {
        return "Time{" +
                "injuryTime1=" + injuryTime1 +
                ", injuryTime2=" + injuryTime2 +
                ", currentPeriodStartTimestamp=" + currentPeriodStartTimestamp +
                '}';
    }
}
