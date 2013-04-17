package com.abushaev.kurs.s0102.guessnumber.views;

import com.abushaev.kurs.s0102.guessnumber.models.StatusGuessing;

import java.util.Scanner;

/**
 * Реализация простого консольного интерфейса игры
 * Author: Abushaev Ruslan
 * e-mail: rouslan@inbox.ru
 * Date: 17.04.13
 * Time: 14:05
 */
public class GConsoleUI implements UIGuessable {
    @Override
    public void ShowStartInfoGame(int maxNumber, int attemptsCount) {
        System.out.println(" ============   Игра угадай число X !!! ===================");
        System.out.println("Вам необходимо угадать число x которое я загадал в диапазоне от 0 .. " + maxNumber);
        System.out.println("Количество попыток:  " + attemptsCount);
    }

    @Override
    public void ShowCurrentInfo(int attemptRemainedCount, int tryingNumber, StatusGuessing currentStatus) {
        System.out.println("");
        switch (currentStatus) {
            case GUESSED: {  // todo тут скобки обычно не ставят
                System.out.println("Поздравляю, вы победили!!!");
                System.out.println("Было загадано x == " + tryingNumber);
                break;
            }
            case LESS: {
                System.out.println("Пока не угадали!!!");
                System.out.println("Загаданное мной число  x < " + tryingNumber);
                System.out.println("У вас осталось попыток:" + attemptRemainedCount);
                break;
            }
            case MORE: {
                System.out.println("Пока не угадали!!!");
                System.out.println("Загаданное мной число  x > " + tryingNumber);
                System.out.println("У вас осталось попыток:" + attemptRemainedCount);
                break;
            }

            case LOSS: {
                System.out.println("Вы проиграли!!!");
                System.out.println("Было загадано x = " + tryingNumber);
                break;
            }
            default: {
                System.out.println("Что-то с памятью моею стало...!!! :)");
            }

        }
    }

    @Override
    public String GetInput() {
        String str;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите число:");
        str = scn.next();
        return str;
    }

    @Override
    public void ShowError(String err) {
        System.out.println("Ошибка : " + err);
    }
}
