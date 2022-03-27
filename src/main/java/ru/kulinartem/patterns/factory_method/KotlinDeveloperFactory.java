package ru.kulinartem.patterns.factory_method;

public class KotlinDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new KotlinDeveloper();
    }
}
