package ru.kulinartem.patterns.factory_method;

public class DeveloperFactoryUtil {

    public static DeveloperFactory createDeveloperFactoryBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("kotlin")) {
            return new KotlinDeveloperFactory();
        } else {
            throw new IllegalArgumentException("There is no factory method for " + speciality + " developer");
        }
    }
}
