package ru.kulinartem.patterns.state;

public class DeveloperDay {

    public static void main(String[] args) {
        Developer developer = new Developer();

        for (int i = 0; i < 10; i++) {
            developer.changeActivity();
        }
    }

}
