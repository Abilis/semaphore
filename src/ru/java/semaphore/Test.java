package ru.java.semaphore;

/**
 * Created by Abilis on 13.05.2016.
 */
public class Test {

    public static void main(String[] args) {

        for (float i = 0.0f; i < 61.0f; i += 0.25f) {
            Semaphore semaphore = new Semaphore();
            semaphore.setAmountMinute(i);
            semaphore.calculateAmountMinuteInTenMinute();
            semaphore.calculateColor();
            semaphore.writeResult();
        }
    }
}
