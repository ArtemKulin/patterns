package ru.kulinartem.patterns.interpreter;

public class InterpreterRunner {

    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isSpringDeveloper = getSpringExpression();

        System.out.println("Does developer knows Java Core: " + isJava.interpret("Java Core"));
        System.out.println("Does developer knows Spring: " + isSpringDeveloper.interpret("Java Spring"));
    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getSpringExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }
}
