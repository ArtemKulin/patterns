package ru.kulinartem.patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.kulinartem.patterns.factory_method.DeveloperFactory;
import ru.kulinartem.patterns.factory_method.DeveloperFactoryUtil;

@SpringBootApplication
public class PatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatternsApplication.class, args);
        DeveloperFactory javaDeveloper = DeveloperFactoryUtil.createDeveloperFactoryBySpeciality("java");
        javaDeveloper.createDeveloper().writeCode();
        DeveloperFactory kotlinDeveloper = DeveloperFactoryUtil.createDeveloperFactoryBySpeciality("KOTLIN");
        kotlinDeveloper.createDeveloper().writeCode();
        try {
            DeveloperFactory exceptionDeveloper = DeveloperFactoryUtil.createDeveloperFactoryBySpeciality("exception");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
