package ru.kulinartem.patterns.facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is doing a job");
        } else {
            System.out.println("Developer is relaxing");
        }
    }
}
