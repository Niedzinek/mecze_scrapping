package org.example.models;

import java.util.ArrayList;

public class Changes{
    public ArrayList<String> changes;
    public int changeTimestamp;

    public Changes() {
    }

    public Changes(ArrayList<String> changes, int changeTimestamp) {
        this.changes = changes;
        this.changeTimestamp = changeTimestamp;
    }

    public ArrayList<String> getChanges() {
        return changes;
    }

    public void setChanges(ArrayList<String> changes) {
        this.changes = changes;
    }

    public int getChangeTimestamp() {
        return changeTimestamp;
    }

    public void setChangeTimestamp(int changeTimestamp) {
        this.changeTimestamp = changeTimestamp;
    }

    @Override
    public String toString() {
        return "Changes{" +
                "changes=" + changes +
                ", changeTimestamp=" + changeTimestamp +
                '}';
    }
}
