package ru.kulinartem.patterns.abstract_factory.banking;

import ru.kulinartem.patterns.abstract_factory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Developer writes banking code");
    }

}
