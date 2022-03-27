package ru.kulinartem.patterns.abstract_factory.website;

import ru.kulinartem.patterns.abstract_factory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website");
    }
}
