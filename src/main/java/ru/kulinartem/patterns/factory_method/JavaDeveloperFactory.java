package ru.kulinartem.patterns.factory_method;

public class JavaDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new JavaDeloper();
    }
}
