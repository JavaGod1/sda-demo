package com.sda.exceptionexample;

import com.sda.exceptionexample.exceptions.InsufficientFundsException;
import com.sda.exceptionexample.util.SoldUtilities;

import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        SoldUtilities bankMethods = new SoldUtilities(10);
//        bankMethods.withdrawWithTry(100);
        try {
            bankMethods.withdraw(100);
        } catch (InsufficientFundsException e) {
            logger.severe("error withdrawing cash");
        }
    }

}
