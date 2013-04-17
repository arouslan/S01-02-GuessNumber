package com.abushaev.kurs.s0102.guessnumber.models;

import java.util.Random;

/**
 * Author: Abushaev Ruslan
 * e-mail: rouslan@inbox.ru
 * Date: 17.04.13
 * Time: 11:17
 */
public class ConceivingModel extends ConceivedData {
    public ConceivingModel(int maxNumber){
      setMaxNumber(maxNumber);
      Conceiving();
    }

    protected void Conceiving() {
      Random rnd = new Random();
      setHiddenNumber(rnd.nextInt(getMaxNumber()));
    }


}
