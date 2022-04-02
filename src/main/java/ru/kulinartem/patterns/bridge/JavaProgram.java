package ru.kulinartem.patterns.bridge;

public class JavaProgram extends Program{

    public JavaProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Java program is developed");
        developer.writeCode();
    }
}
