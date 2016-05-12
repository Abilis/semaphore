package ru.java.semaphore;

/**
 * Created by Abilis on 12.05.2016.
 */
public class ConsoleHelper {

    public static void writeMessage(String message) {
        System.out.print(message);
    }

    public static void writeMessageWithBl(String message) {
            message += "\n";
        writeMessage(message);
    }

}
