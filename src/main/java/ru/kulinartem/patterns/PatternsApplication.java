package ru.kulinartem.patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.kulinartem.patterns.abstract_factory.Developer;
import ru.kulinartem.patterns.abstract_factory.ProjectManager;
import ru.kulinartem.patterns.abstract_factory.ProjectTeamFactory;
import ru.kulinartem.patterns.abstract_factory.Tester;
import ru.kulinartem.patterns.abstract_factory.banking.BankingTeamFactory;
import ru.kulinartem.patterns.abstract_factory.website.WebsiteTeamFactory;
import ru.kulinartem.patterns.builder.Director;
import ru.kulinartem.patterns.builder.EnterpriseWebsiteBuilder;
import ru.kulinartem.patterns.builder.VisitCardWebsiteBuilder;
import ru.kulinartem.patterns.builder.Website;
import ru.kulinartem.patterns.factory_method.DeveloperFactory;
import ru.kulinartem.patterns.factory_method.DeveloperFactoryUtil;
import ru.kulinartem.patterns.singleton.ProgramLogger;

import java.sql.SQLOutput;

@SpringBootApplication
public class PatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatternsApplication.class, args);

        System.out.println("*** Factory methods examples *** \n");
        DeveloperFactory javaDeveloper = DeveloperFactoryUtil.createDeveloperFactoryBySpeciality("java");
        javaDeveloper.createDeveloper().writeCode();
        DeveloperFactory kotlinDeveloper = DeveloperFactoryUtil.createDeveloperFactoryBySpeciality("KOTLIN");
        kotlinDeveloper.createDeveloper().writeCode();
        try {
            DeveloperFactory exceptionDeveloper = DeveloperFactoryUtil.createDeveloperFactoryBySpeciality("exception");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("---------------------------------------------------------------");

        System.out.println("*** Abstract factory examples *** \n");
        ProjectTeamFactory bankingTeamFactory = new BankingTeamFactory();
        Developer bankingDeveloper = bankingTeamFactory.getDeveloper();
        Tester bankingTester = bankingTeamFactory.getTester();
        ProjectManager bankingTeamFactoryProjectManager = bankingTeamFactory.getProjectManager();

        bankingDeveloper.writeCode();
        bankingTester.testCode();
        bankingTeamFactoryProjectManager.manageCode();

        ProjectTeamFactory websiteTeamFactory = new WebsiteTeamFactory();
        Developer websiteDeveloper = websiteTeamFactory.getDeveloper();
        Tester websiteTester = websiteTeamFactory.getTester();
        ProjectManager websiteProjectManager = websiteTeamFactory.getProjectManager();

        websiteDeveloper.writeCode();
        websiteTester.testCode();
        websiteProjectManager.manageCode();

        System.out.println("---------------------------------------------------------------");

        System.out.println("*** Singleton ***");
        System.out.println("Is the same object of ProgramLogger by calling get instance method? The answer is " +
               ProgramLogger.getProgramLogger().equals(ProgramLogger.getProgramLogger()));
        System.out.println(ProgramLogger.getProgramLogger());
        System.out.println(ProgramLogger.getProgramLogger());
        ProgramLogger.getProgramLogger().addLogFile("This is log A");
        ProgramLogger.getProgramLogger().addLogFile("This is log B");

        ProgramLogger.getProgramLogger().showLogFile();
        System.out.println("---------------------------------------------------------------");

        System.out.println("*** Builder ***\n");
        Director director = new Director();
        director.setBuilder(new VisitCardWebsiteBuilder());
        Website visitCardWebsite = director.buildWebsite();
        System.out.println("This is website from visitCardBuilder " + visitCardWebsite);
        director.setBuilder(new EnterpriseWebsiteBuilder());
        Website enterpriseWebsite = director.buildWebsite();
        System.out.println("This is website from enterpriseBuilder " + enterpriseWebsite);

        System.out.println("---------------------------------------------------------------");
    }

}
