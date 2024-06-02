package org.example.models;

public class UniqueTournament{
    public String name;
    public String slug;
    public Category category;
    public int userCount;
    public int id;
    public boolean hasEventPlayerStatistics;
    public boolean displayInverseHomeAwayTeams;

    public UniqueTournament() {
    }

    public UniqueTournament(String name, String slug, Category category, int userCount, int id, boolean hasEventPlayerStatistics, boolean displayInverseHomeAwayTeams) {
        this.name = name;
        this.slug = slug;
        this.category = category;
        this.userCount = userCount;
        this.id = id;
        this.hasEventPlayerStatistics = hasEventPlayerStatistics;
        this.displayInverseHomeAwayTeams = displayInverseHomeAwayTeams;
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

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isHasEventPlayerStatistics() {
        return hasEventPlayerStatistics;
    }

    public void setHasEventPlayerStatistics(boolean hasEventPlayerStatistics) {
        this.hasEventPlayerStatistics = hasEventPlayerStatistics;
    }

    public boolean isDisplayInverseHomeAwayTeams() {
        return displayInverseHomeAwayTeams;
    }

    public void setDisplayInverseHomeAwayTeams(boolean displayInverseHomeAwayTeams) {
        this.displayInverseHomeAwayTeams = displayInverseHomeAwayTeams;
    }

    @Override
    public String toString() {
        return "UniqueTournament{" +
                "name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", category=" + category +
                ", userCount=" + userCount +
                ", id=" + id +
                ", hasEventPlayerStatistics=" + hasEventPlayerStatistics +
                ", displayInverseHomeAwayTeams=" + displayInverseHomeAwayTeams +
                '}';
    }
}
