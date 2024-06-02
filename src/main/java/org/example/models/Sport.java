package org.example.models;

public class Sport{
    public String name;
    public String slug;
    public int id;

    public Sport() {
    }

    public Sport(String name, String slug, int id) {
        this.name = name;
        this.slug = slug;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", id=" + id +
                '}';
    }
}
