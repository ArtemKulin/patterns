package ru.kulinartem.patterns.strategy;

public class Eating implements Activity{

    @Override
    public void justDoIt() {
        System.out.println("Eating...");
    }
}
