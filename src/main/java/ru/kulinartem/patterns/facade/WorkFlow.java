package ru.kulinartem.patterns.facade;

public class WorkFlow {

    private final Developer developer = new Developer();
    private final Job job = new Job();
    private final BugTracker bugTracker = new BugTracker();

    public void solveProblems() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }

    public void doNothing() {
        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }

}
