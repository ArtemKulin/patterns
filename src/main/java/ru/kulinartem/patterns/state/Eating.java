package ru.kulinartem.patterns.state;

public class Eating implements Activity{

    @Override
    public void justDoIt() {
        System.out.println("Developer is eating some food...");
    }
}
