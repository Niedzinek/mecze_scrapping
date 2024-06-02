package org.example.models;

import java.util.ArrayList;

public class AwayTeam{
    public String name;
    public String slug;
    public String shortName;
    public Sport sport;
    public int userCount;
    public String nameCode;
    public boolean disabled;
    public boolean national;
    public int type;
    public int id;
    public Country country;
    public ArrayList<Object> subTeams;
    public TeamColors teamColors;
    public FieldTranslations fieldTranslations;

    public AwayTeam() {
    }

    public AwayTeam(String name, String slug, String shortName, Sport sport, int userCount, String nameCode, boolean disabled, boolean national, int type, int id, Country country, ArrayList<Object> subTeams, TeamColors teamColors, FieldTranslations fieldTranslations) {
        this.name = name;
        this.slug = slug;
        this.shortName = shortName;
        this.sport = sport;
        this.userCount = userCount;
        this.nameCode = nameCode;
        this.disabled = disabled;
        this.national = national;
        this.type = type;
        this.id = id;
        this.country = country;
        this.subTeams = subTeams;
        this.teamColors = teamColors;
        this.fieldTranslations = fieldTranslations;
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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public String getNameCode() {
        return nameCode;
    }

    public void setNameCode(String nameCode) {
        this.nameCode = nameCode;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public boolean isNational() {
        return national;
    }

    public void setNational(boolean national) {
        this.national = national;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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

    public ArrayList<Object> getSubTeams() {
        return subTeams;
    }

    public void setSubTeams(ArrayList<Object> subTeams) {
        this.subTeams = subTeams;
    }

    public TeamColors getTeamColors() {
        return teamColors;
    }

    public void setTeamColors(TeamColors teamColors) {
        this.teamColors = teamColors;
    }

    public FieldTranslations getFieldTranslations() {
        return fieldTranslations;
    }

    public void setFieldTranslations(FieldTranslations fieldTranslations) {
        this.fieldTranslations = fieldTranslations;
    }

    @Override
    public String toString() {
        return "AwayTeam{" +
                "name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", shortName='" + shortName + '\'' +
                ", sport=" + sport +
                ", userCount=" + userCount +
                ", nameCode='" + nameCode + '\'' +
                ", disabled=" + disabled +
                ", national=" + national +
                ", type=" + type +
                ", id=" + id +
                ", country=" + country +
                ", subTeams=" + subTeams +
                ", teamColors=" + teamColors +
                ", fieldTranslations=" + fieldTranslations +
                '}';
    }
}
