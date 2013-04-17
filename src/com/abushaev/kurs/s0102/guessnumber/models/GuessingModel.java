package com.abushaev.kurs.s0102.guessnumber.models;

/**
 * Author: Abushaev Ruslan
 * e-mail: rouslan@inbox.ru
 * Date: 17.04.13
 * Time: 12:03
 */
public class GuessingModel extends ConceivingModel {
    private int attemptCount;

    public int getAttemptCount() {
        return attemptCount;
    }

    // todo все методы с маленькой
    private void ReduceAttempts() {
        attemptCount -= 1;
    }


    public GuessingModel(int maxNumber, int attemptCount) {
        super(maxNumber);
        if (attemptCount < 1) {
            // одна поптка дается всегда, модель такая! :)
            attemptCount = 1;
        }
        this.attemptCount = attemptCount;
    }

    private StatusGuessing DoTry(int tryNumber) {
        int hNumber = getHiddenNumber();
        if (hNumber > tryNumber) {
            return StatusGuessing.MORE;
        } else if (hNumber < tryNumber) {
            return StatusGuessing.LESS;
        } else {
            return StatusGuessing.GUESSED;
        }
    }

    public StatusGuessing DoAttempt(int tryNumber) {
        StatusGuessing status;
        ReduceAttempts();
        status = DoTry(tryNumber);
        if ((getAttemptCount() < 1) & (status != StatusGuessing.GUESSED)) {
            status = StatusGuessing.LOSS;
        }
        return status;
    }

}
