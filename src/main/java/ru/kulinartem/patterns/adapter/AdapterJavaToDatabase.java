package ru.kulinartem.patterns.adapter;

public class AdapterJavaToDatabase extends JavaApplication implements Database{

    @Override
    public void insert() {
        insertObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }

    @Override
    public void save() {
        saveObject();
    }
}
