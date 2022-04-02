package ru.kulinartem.patterns.decorator;

public class TeamLead extends JavaDeveloperDecorator{

    public TeamLead(Developer developer) {
        super(developer);
    }

    public String sendReport() {
        return " and sends report";
    }

    @Override
    public String doJob() {
        return super.doJob() + sendReport();
    }
}
