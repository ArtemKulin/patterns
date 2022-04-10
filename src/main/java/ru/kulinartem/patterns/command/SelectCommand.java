package ru.kulinartem.patterns.command;

public class SelectCommand implements Command{
    private final Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
