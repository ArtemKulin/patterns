package ru.kulinartem.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed{

    private List<String> events = new ArrayList<>();
    private List<Observer> subcribers = new ArrayList<>();

    public void addEvent(String event) {
        events.add(event);
        notifyObservers();
    }

    public void deleteEvent(String event) {
        events.remove(event);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subcribers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        subcribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: subcribers) {
            observer.handleEvent(events);
        }
    }
}
