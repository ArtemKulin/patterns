package ru.kulinartem.patterns.abstract_factory.website;

import ru.kulinartem.patterns.abstract_factory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes website code");
    }
}
