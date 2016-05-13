package ru.java.semaphore;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by Abilis on 13.05.2016.
 */
public class Util {

    public static void closeQuitely(Closeable resourse) {

        try {
            resourse.close();
        } catch (IOException ignore) {
            /*NOP*/
        }
    }
}
