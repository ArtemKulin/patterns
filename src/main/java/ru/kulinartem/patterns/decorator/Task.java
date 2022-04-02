package ru.kulinartem.patterns.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaDeveloper();
        System.out.println("Developer " + developer.doJob());
        Developer seniorDeveloper = new SeniorJavaDeveloper(developer);
        System.out.println("Senior " + seniorDeveloper.doJob());
        Developer teamLead = new TeamLead(seniorDeveloper);
        System.out.println("TeamLead " + teamLead.doJob());
    }
}

