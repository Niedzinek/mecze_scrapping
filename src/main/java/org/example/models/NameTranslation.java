package org.example.models;

public class NameTranslation{
    public String ar;
    public String ru;

    public NameTranslation() {
    }

    public NameTranslation(String ar, String ru) {
        this.ar = ar;
        this.ru = ru;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

    public String getRu() {
        return ru;
    }

    public void setRu(String ru) {
        this.ru = ru;
    }

    @Override
    public String toString() {
        return "NameTranslation{" +
                "ar='" + ar + '\'' +
                ", ru='" + ru + '\'' +
                '}';
    }
}
