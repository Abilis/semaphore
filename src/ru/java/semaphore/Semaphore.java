package ru.java.semaphore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Abilis on 12.05.2016.
 */
public class Semaphore {

    private BufferedReader reader;
    private float amountMinute;

    void setAmountMinute(float amountMinute) {
        this.amountMinute = amountMinute;
    }

    private float normalAmountMinute;
    private static final String GREATING_MESSAGE = "Первые 2 минуты каждого часа горит зеленый цвет сфетовора," +
            " затем 3 - желтый, затем 5 - красный.\nВведите количество минут, прошедших с начала часа, и программа" +
            " покажет цвет сфетофора в этот момент.\nКоличество минут может быть дробным";
    private String calculatedColor;


    public void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        this.writeGreatingMessage();
        this.initAmountMinute();
        this.calculateAmountMinuteInTenMinute();
        this.calculateColor();
        this.writeResult();
    }

    private void writeGreatingMessage() {
        ConsoleHelper.writeMessageWithBl(GREATING_MESSAGE);
    }

    private void initAmountMinute() {

        while (true) {
            try {
                amountMinute = Float.parseFloat(reader.readLine());
                if (amountMinute < 0) {
                    throw new NumberFormatException("Отрицательные числа непозволительны");
                }
                break;
            } catch (IOException | NumberFormatException e) {
                ConsoleHelper.writeMessageWithBl("Некорректные данные. Попробуйте еще раз");
            }
        }
    }

    /**
     * метод вычисляет количество минут, прошедших с начала очередной десятиминутки, т.е. все события повторяются
     * с периодичностью 10 минут
     */
    void calculateAmountMinuteInTenMinute() {
        this.normalAmountMinute = amountMinute % 10;
    }

    void calculateColor() {

        if (normalAmountMinute < 2) {
            calculatedColor = "зеленый";
        }
        else if (normalAmountMinute < 5) {
            calculatedColor = "желтый";
        }
        else {
            calculatedColor = "красный";
        }
    }

    void writeResult() {
        ConsoleHelper.writeMessageWithBl("На минуте " + amountMinute + " горит " + calculatedColor + " цвет");

    }
}
