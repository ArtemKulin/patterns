package ru.kulinartem.patterns.chain_of_responsibility;

public class BugTracker {

    public static void main(String[] args) {
        Notifier simpleNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        simpleNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        simpleNotifier.notifyManager("Everything is OK", Priority.ROUTINE);
        simpleNotifier.notifyManager("We have some problems", Priority.IMPORTANT);
        simpleNotifier.notifyManager("SOS!!!", Priority.ASAP);
    }

}
