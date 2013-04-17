package com.abushaev.kurs.s0102.guessnumber.views;

import com.abushaev.kurs.s0102.guessnumber.models.StatusGuessing;

/**
 * Author: Abushaev Ruslan
 * e-mail: rouslan@inbox.ru
 * Date: 17.04.13
 * Time: 13:54
 */
public interface UIGuessable {
    /**
     * Интерфейс отображения стартовой информации о условиях игры, запускается в начале игры
     * @param maxNumber   - диапазон загадывания чисел до maxNumber
     * @param attemptsCount   - максимальное количесвто попыток
     */
    void ShowStartInfoGame(int maxNumber, int attemptsCount);

    /**
     * Интерфейс для отображения состояния игры после сделанной попытки
     * @param attemptRemainedCount  - оставшееся количество попыток
     * @param tryingNumber  - проверяемое число пользователя. Если проигрыш то в него записывается загаданное число
     * @param currentStatus - статус сделанной попытки
     */
    void ShowCurrentInfo(int attemptRemainedCount, int tryingNumber, StatusGuessing currentStatus);

    /**
     * Интерфейс для считывания данных пользователя
     * @return - введенная строка
     */
   String GetInput();

   void ShowError(String err);

}
