package org.example.models;

public class Status{
    public int code;
    public String description;
    public String type;

    public Status() {
    }

    public Status(int code, String description, String type) {
        this.code = code;
        this.description = description;
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Status{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
