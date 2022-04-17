package ru.kulinartem.patterns.strategy;

public class Sleeping implements Activity{

    @Override
    public void justDoIt() {
        System.out.println("sleeping...");
    }
}
