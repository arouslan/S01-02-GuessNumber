package com.abushaev.kurs.s0102.guessnumber.views;

import com.abushaev.kurs.s0102.guessnumber.models.StatusGuessing;

/**
 * Author: Abushaev Ruslan
 * e-mail: rouslan@inbox.ru
 * Date: 17.04.13
 * Time: 14:17
 */


  // TODO Реализовать оконный интерфейс

public class GSwingUI implements UIGuessable {
    @Override
    public void ShowStartInfoGame(int maxNumber, int attemptsCount) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void ShowCurrentInfo(int attemptRemainedCount, int tryingNumber, StatusGuessing currentStatus) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String GetInput() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void ShowError(String err) {
        //To change body of implemented methods use File | Settings | File Templates.
    }


}
