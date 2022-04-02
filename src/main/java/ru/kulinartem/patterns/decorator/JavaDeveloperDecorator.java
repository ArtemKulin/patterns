package ru.kulinartem.patterns.decorator;

public class JavaDeveloperDecorator implements Developer{
    protected Developer developer;

    public JavaDeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String doJob() {
        return developer.doJob();
    }
}
