package ru.kulinartem.patterns.interpreter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TerminalExpression implements Expression {
    private String data;

    @Override
    public boolean interpret(String expression) {
        return expression.contains(data);
    }
}
