package ru.kulinartem.patterns.composite;

public class Project {
    public static void main(String[] args) {
        System.out.println("*** Composite ***\n");
        Team team = new Team();
        Developer javaDeveloper = new JavaDeveloper();
        Developer anotherJavaDeveloper = new JavaDeveloper();
        Developer javascriptDeveloper = new JavascriptDeveloper();

        team.addDeveloper(javaDeveloper);
        team.addDeveloper(anotherJavaDeveloper);
        team.addDeveloper(javascriptDeveloper);

        team.createProject();

    }
}
