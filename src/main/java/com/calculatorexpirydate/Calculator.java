package com.calculatorexpirydate;

import java.util.Calendar;
import java.util.Date;

public class Calculator {

    private static final int EXPIRATION = 60 * 24;

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        cal.setTimeInMillis(new Date().getTime());
        cal.add(Calendar.MINUTE, Calculator.EXPIRATION);
        new Date(cal.getTime().getTime());

        // Пример

        // Получается вот так
        System.out.println(new Date(cal.getTime().getTime()));

        // А это текущая дата для сравнения от того как получается
        System.out.println(new Date());

    }

}
