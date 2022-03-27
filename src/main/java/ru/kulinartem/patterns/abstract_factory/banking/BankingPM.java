package ru.kulinartem.patterns.abstract_factory.banking;

import ru.kulinartem.patterns.abstract_factory.ProjectManager;

public class BankingPM implements ProjectManager {

    @Override
    public void manageCode() {
        System.out.println("Banking PM manages banking project");
    }
}
