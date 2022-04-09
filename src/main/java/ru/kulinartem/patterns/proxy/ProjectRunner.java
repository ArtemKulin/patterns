package ru.kulinartem.patterns.proxy;

public class ProjectRunner {

    public static void main(String[] args) {
        Project project = new ProxyProject("url");

        project.run();

    }
}
