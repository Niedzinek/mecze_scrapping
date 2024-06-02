package org.example.models;

import java.util.ArrayList;

public class Root{
    public ArrayList<Event> events;

    public Root() {
    }

    public Root(ArrayList<Event> events) {
        this.events = events;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return "Root{" +
                "events=" + events +
                '}';
    }
}
