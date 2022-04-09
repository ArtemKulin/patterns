package ru.kulinartem.patterns.facade;

public class SprintRunner {

    public static void main(String[] args) {
        WorkFlow workFlow = new WorkFlow();
        workFlow.doNothing();
        workFlow.solveProblems();
    }
}
