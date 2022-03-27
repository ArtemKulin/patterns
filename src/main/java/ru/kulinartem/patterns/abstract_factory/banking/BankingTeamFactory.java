package ru.kulinartem.patterns.abstract_factory.banking;

import ru.kulinartem.patterns.abstract_factory.Developer;
import ru.kulinartem.patterns.abstract_factory.ProjectManager;
import ru.kulinartem.patterns.abstract_factory.ProjectTeamFactory;
import ru.kulinartem.patterns.abstract_factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
