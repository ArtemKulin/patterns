package ru.kulinartem.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();
        List<Developer> developers = new ArrayList<>();
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("php"));
        developers.add(developerFactory.getDeveloperBySpeciality("php"));
        developers.add(developerFactory.getDeveloperBySpeciality("php"));
        developers.add(developerFactory.getDeveloperBySpeciality("php"));
        developers.add(developerFactory.getDeveloperBySpeciality("php"));

        for (Developer developer: developers) {
            developer.writeCode();
        }

        developers.add(developerFactory.getDeveloperBySpeciality("kotlin"));

    }
}
