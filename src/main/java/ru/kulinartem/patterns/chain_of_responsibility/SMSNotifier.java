package ru.kulinartem.patterns.chain_of_responsibility;

public class SMSNotifier extends Notifier{

    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS with message " + message);
    }
}
