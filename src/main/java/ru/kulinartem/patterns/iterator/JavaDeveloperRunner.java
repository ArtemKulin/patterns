package ru.kulinartem.patterns.iterator;

public class JavaDeveloperRunner {

    public static void main(String[] args) {

        String[] skills = {"java", "spring", "hibernate", "postgres"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Artem", skills);

        Iterator<String> iterator = javaDeveloper.getIterator();
        System.out.println("Developer " + javaDeveloper.getName());
        System.out.print("Skills: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
