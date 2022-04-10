package ru.kulinartem.patterns.chain_of_responsibility;

public class EmailNotifier extends Notifier{

    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email with message: " + message);
    }
}
