package ru.kulinartem.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private final List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void createProject() {
        System.out.println("Project is created");
        for (Developer developer: developers) {
            developer.writeCode();
        }
    }
}
