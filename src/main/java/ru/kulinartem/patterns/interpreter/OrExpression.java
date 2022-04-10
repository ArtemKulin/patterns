package ru.kulinartem.patterns.interpreter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OrExpression implements Expression {
    private Expression expression1;
    private Expression expression2;

    @Override
    public boolean interpret(String expression) {
        return expression1.interpret(expression) || expression2.interpret(expression);
    }
}
