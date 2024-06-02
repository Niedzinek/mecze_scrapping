package org.example;

import org.example.models.*;

import java.util.ArrayList;
import java.util.List;

public class Events {
    public List<Event> events = new ArrayList<>();

    public Events() {
    }

    public Events(List<Event> events) {
        this.events = events;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return "Events{" +
                "events=" + events +
                '}';
    }
}