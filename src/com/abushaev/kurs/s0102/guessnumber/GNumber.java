package com.abushaev.kurs.s0102.guessnumber;

import com.abushaev.kurs.s0102.guessnumber.controllers.GController;
import com.abushaev.kurs.s0102.guessnumber.views.GConsoleUI;

/**
 * Author: Abushaev Ruslan
 * e-mail: rouslan@inbox.ru
 * Date: 17.04.13
 * Time: 10:18
 */
public class GNumber {

    public static void main(String[] args) {
        GConsoleUI gUIConsole = new GConsoleUI();
        GController gController = new GController(gUIConsole);
        gController.Run();  // todo методы в java с маленькой буквы!
    }
}
