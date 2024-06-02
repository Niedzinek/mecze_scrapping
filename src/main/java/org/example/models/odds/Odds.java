package org.example.models.odds;

public class Odds {
    public Choice choice;
    public Market market;
    public Root root;

    public Odds() {
    }

    public Odds(Choice choice, Market market, Root root) {
        this.choice = choice;
        this.market = market;
        this.root = root;
    }

    public Choice getChoice() {
        return choice;
    }

    public void setChoice(Choice choice) {
        this.choice = choice;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public Root getRoot() {
        return root;
    }

    public void setRoot(Root root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return "Odds{" +
                "choice=" + choice +
                ", market=" + market +
                ", root=" + root +
                '}';
    }
}
