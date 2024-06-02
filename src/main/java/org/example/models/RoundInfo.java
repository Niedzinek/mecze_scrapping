package org.example.models;

public class RoundInfo{
    public int round;

    public RoundInfo() {
    }

    public RoundInfo(int round) {
        this.round = round;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    @Override
    public String toString() {
        return "RoundInfo{" +
                "round=" + round +
                '}';
    }
}
