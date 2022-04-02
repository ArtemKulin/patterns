package ru.kulinartem.patterns.bridge;

public class PhpProgram extends Program{

    public PhpProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Php program is developed");
        developer.writeCode();
    }
}
