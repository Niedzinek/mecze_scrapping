package org.example.models;

public class Country{
    public String alpha2;
    public String alpha3;
    public String name;

    public Country() {
    }

    public Country(String alpha2, String alpha3, String name) {
        this.alpha2 = alpha2;
        this.alpha3 = alpha3;
        this.name = name;
    }

    public String getAlpha2() {
        return alpha2;
    }

    public void setAlpha2(String alpha2) {
        this.alpha2 = alpha2;
    }

    public String getAlpha3() {
        return alpha3;
    }

    public void setAlpha3(String alpha3) {
        this.alpha3 = alpha3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "alpha2='" + alpha2 + '\'' +
                ", alpha3='" + alpha3 + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
