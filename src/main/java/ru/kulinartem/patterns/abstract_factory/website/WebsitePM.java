package ru.kulinartem.patterns.abstract_factory.website;

import ru.kulinartem.patterns.abstract_factory.ProjectManager;

public class WebsitePM implements ProjectManager {

    @Override
    public void manageCode() {
        System.out.println("Project manager manage website");
    }

}
