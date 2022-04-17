package ru.kulinartem.patterns.observer;

public class JobSite {
    public static void main(String[] args) {

        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addEvent("First Java Position");
        jobSite.addEvent("Second Java Position");

        Observer firstSubscriber = new Subscriber("Artem");
        Observer secondSubscriber = new Subscriber("Alex");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addEvent("Third Java Position");

        jobSite.deleteObserver(secondSubscriber);

        jobSite.deleteEvent("First Java Position");

    }
}
