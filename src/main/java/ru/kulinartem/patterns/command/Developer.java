package ru.kulinartem.patterns.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Developer {
    private Command insert;
    private Command select;
    private Command update;
    private Command delete;

    public void insert() {
        insert.execute();
    }

    public void select() {
        select.execute();
    }

    public void update() {
        update.execute();
    }

    public void delete() {
        delete.execute();
    }
}
