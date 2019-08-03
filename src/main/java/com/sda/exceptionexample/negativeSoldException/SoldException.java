package com.sda.exceptionexample.negativeSoldException;

public class SoldException extends Exception {
    public SoldException() {
        super("Sold negativ!");
    }

}
