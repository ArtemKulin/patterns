package ru.kulinartem.patterns.command;

public class DatabaseRunner {

    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new InsertCommand(database),
                new SelectCommand(database),
                new UpdateCommand(database),
                new DeleteCommand(database)
        );

        developer.delete();
        developer.insert();
        developer.select();
        developer.update();
    }
}
