package ru.kulinartem.patterns.state;

public class Reading implements Activity{

    @Override
    public void justDoIt() {
        System.out.println("Developer is reading a book...");
    }
}
