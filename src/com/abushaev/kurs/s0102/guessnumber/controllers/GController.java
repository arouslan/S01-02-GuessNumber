package com.abushaev.kurs.s0102.guessnumber.controllers;

import com.abushaev.kurs.s0102.guessnumber.GParams;
import com.abushaev.kurs.s0102.guessnumber.models.GuessingModel;
import com.abushaev.kurs.s0102.guessnumber.models.StatusGuessing;
import com.abushaev.kurs.s0102.guessnumber.views.UIGuessable;

import java.util.Scanner;

/**
 * Author: Abushaev Ruslan
 * e-mail: rouslan@inbox.ru
 * Date: 17.04.13
 * Time: 10:23
 */

public class GController {
    private GuessingModel gModel;
    private UIGuessable gUI;

    public void Run() {
        int tryingNumber;
        StatusGuessing currentStatus;
        gUI.ShowStartInfoGame(GParams.MAX_NUMBERS, GParams.MAX_ATTEMPTS);
        do {
            tryingNumber = GetTryingNumber();
            currentStatus = gModel.DoAttempt(tryingNumber);
            if (currentStatus == StatusGuessing.LOSS) tryingNumber = gModel.getHiddenNumber();
            gUI.ShowCurrentInfo(gModel.getAttemptCount(), tryingNumber, currentStatus);
        } while (currentStatus == StatusGuessing.LESS | currentStatus == StatusGuessing.MORE);
    }

    private int GetTryingNumber() {
        int number =0; // todo отформатировать проект с помощью CTRL_ALT_L
        boolean isValid = false;
        while (!isValid) {
            // todo тут, мне кажется, изящнее будет использовать
            // todo Integer.valueOf(gUI.GetInput()) и ловить NumberFormatException,
            // todo но это не обязательно исправлять
            Scanner scn = new Scanner(gUI.GetInput());
            try {
                number = scn.nextInt();
                if ((number >= 0) & (number <= GParams.MAX_NUMBERS)) {
                    isValid = true;
                } else {
                   gUI.ShowError(" Число должно быть в диапазоне от 0 .."+ GParams.MAX_NUMBERS+"!!!");
                }
            } catch (RuntimeException e) {
                scn.next();
                gUI.ShowError("Вы должны вводить целые числовые значения!!!");
            }
        }
        return number;
    }

    public GController(UIGuessable gUI) {
        gModel = new GuessingModel(GParams.MAX_NUMBERS, GParams.MAX_ATTEMPTS);
        this.gUI = gUI;
    }
}
