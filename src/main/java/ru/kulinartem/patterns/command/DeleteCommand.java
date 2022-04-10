package ru.kulinartem.patterns.command;

public class DeleteCommand implements Command{
    private final Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
