package ru.kulinartem.patterns.singleton;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
public class ProgramLogger {

    private static volatile ProgramLogger programLogger;
    private static String loggerFile = "This is log file. \n";

    public static ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            synchronized (ProgramLogger.class) {
                if (programLogger == null) {
                    return new ProgramLogger();
                }
            }
        }
        return programLogger;
    }

    private ProgramLogger() {
    }

    public void addLogFile(String logInfo) {
        loggerFile += logInfo + " \n";
    }

    public void showLogFile() {
        System.out.println(loggerFile);
    }

}
