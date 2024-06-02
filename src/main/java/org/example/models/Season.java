package org.example.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Season{
    public String name;
    public String year;
    public boolean editor;
    public int id;
    @JsonIgnore
    private String coverage;
    public Season() {
    }

    public Season(String name, String year, boolean editor, int id) {
        this.name = name;
        this.year = year;
        this.editor = editor;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isEditor() {
        return editor;
    }

    public void setEditor(boolean editor) {
        this.editor = editor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", editor=" + editor +
                ", id=" + id +
                '}';
    }
}
