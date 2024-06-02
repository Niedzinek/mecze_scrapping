package org.example.models;

public class FieldTranslations{
    public NameTranslation nameTranslation;
    public ShortNameTranslation shortNameTranslation;

    public FieldTranslations() {
    }

    public FieldTranslations(NameTranslation nameTranslation, ShortNameTranslation shortNameTranslation) {
        this.nameTranslation = nameTranslation;
        this.shortNameTranslation = shortNameTranslation;
    }

    public ShortNameTranslation getShortNameTranslation() {
        return shortNameTranslation;
    }

    public void setShortNameTranslation(ShortNameTranslation shortNameTranslation) {
        this.shortNameTranslation = shortNameTranslation;
    }

    public NameTranslation getNameTranslation() {
        return nameTranslation;
    }

    public void setNameTranslation(NameTranslation nameTranslation) {
        this.nameTranslation = nameTranslation;
    }

    @Override
    public String toString() {
        return "FieldTranslations{" +
                "nameTranslation=" + nameTranslation +
                ", shortNameTranslation=" + shortNameTranslation +
                '}';
    }
}
