package ru.kulinartem.patterns.command;

public class InsertCommand implements Command {
    private final Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
