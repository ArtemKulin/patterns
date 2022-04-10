package ru.kulinartem.patterns.command;

public class UpdateCommand implements Command{
    private final Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
