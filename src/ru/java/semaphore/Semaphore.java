package ru.java.semaphore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Abilis on 12.05.2016.
 */
public class Semaphore {

    private BufferedReader reader;
    private int amountMinute;
    private static final String GREATING_MESSAGE = "Первые 2 минуты каждого часа горит зеленый цвет сфетовора," +
            " затем 3 - желтый, затем 5 - красный.\nВведите количество минут прошедших с начала часа, и программа" +
            " покажет цвет сфетофора в эту минуту";

    public void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        this.writeGreatingMessage();
        this.initAmountMinute();
        this.calculateColor();


    }

    private void writeGreatingMessage() {
        ConsoleHelper.writeMessageWithBl(GREATING_MESSAGE);
    }

    private void initAmountMinute() {

        while (true) {
            try {
                amountMinute = Integer.parseInt(reader.readLine());
                break;
            } catch (IOException | NumberFormatException e) {
                ConsoleHelper.writeMessageWithBl("Некорректные данные. Попробуйте еще раз");
            }
        }
    }

    private void calculateColor() {

    }
}
