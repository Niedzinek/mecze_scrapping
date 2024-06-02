package org.example.models;

public class Category{
    public String name;
    public String slug;
    public Sport sport;
    public int id;
    public Country country;
    public String flag;
    public String alpha2;

    public Category() {
    }

    public Category(String name, String slug, Sport sport, int id, Country country, String flag, String alpha2) {
        this.name = name;
        this.slug = slug;
        this.sport = sport;
        this.id = id;
        this.country = country;
        this.flag = flag;
        this.alpha2 = alpha2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getAlpha2() {
        return alpha2;
    }

    public void setAlpha2(String alpha2) {
        this.alpha2 = alpha2;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", sport=" + sport +
                ", id=" + id +
                ", country=" + country +
                ", flag='" + flag + '\'' +
                ", alpha2='" + alpha2 + '\'' +
                '}';
    }
}
