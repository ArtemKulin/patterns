package ru.kulinartem.patterns.bridge;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Program {
    protected Developer developer;

    public abstract void developProgram();

}
