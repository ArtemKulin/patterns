package ru.kulinartem.patterns.decorator;

public class SeniorJavaDeveloper extends JavaDeveloperDecorator{

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String reviewCode() {
        return " and review code";
    }

    @Override
    public String doJob() {
        return super.doJob() + reviewCode();
    }
}
