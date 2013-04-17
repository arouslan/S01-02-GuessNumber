package com.abushaev.kurs.s0102.guessnumber.models;

/**
 * Author: Abushaev Ruslan
 * e-mail: rouslan@inbox.ru
 * Date: 17.04.13
 * Time: 10:28
 */
class ConceivedData {
    private int hiddenNumber;     //загаданное число
    private int maxNumber;        //максимальное число загадывания

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getHiddenNumber() {
        return hiddenNumber;
    }

    protected void setHiddenNumber(int hiddenNumber) {
        this.hiddenNumber = hiddenNumber;
    }

    protected void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }




}
