package org.example.models;

public class Tournament{
    public String name;
    public String slug;
    public Category category;
    public UniqueTournament uniqueTournament;
    public int priority;
    public int id;

    public Tournament() {
    }

    public Tournament(String name, String slug, Category category, UniqueTournament uniqueTournament, int priority, int id) {
        this.name = name;
        this.slug = slug;
        this.category = category;
        this.uniqueTournament = uniqueTournament;
        this.priority = priority;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public UniqueTournament getUniqueTournament() {
        return uniqueTournament;
    }

    public void setUniqueTournament(UniqueTournament uniqueTournament) {
        this.uniqueTournament = uniqueTournament;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", category=" + category +
                ", uniqueTournament=" + uniqueTournament +
                ", priority=" + priority +
                ", id=" + id +
                '}';
    }
}
