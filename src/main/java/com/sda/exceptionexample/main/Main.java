package com.sda.exceptionexample.main;

import com.sda.exceptionexample.negativeSoldException.SoldException;
import com.sda.exceptionexample.negativeSoldException.SoldUtilities;

public class Main {
    public static void main(String[] args) {

        SoldUtilities bankMethods = new SoldUtilities(10);
        bankMethods.drawWithTry(100);
        try {
            bankMethods.draw(100);
        } catch (SoldException e) {
            e.printStackTrace();
        }
    }

}
