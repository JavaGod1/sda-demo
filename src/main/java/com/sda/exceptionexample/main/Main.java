package com.sda.exceptionexample.main;

import com.sda.exceptionexample.negativeSoldException.SoldUtilities;

public class Main {
    public static void main(String[] args) {

        SoldUtilities bankMethods = new SoldUtilities(10);
        bankMethods.draw(1);
    }

}
