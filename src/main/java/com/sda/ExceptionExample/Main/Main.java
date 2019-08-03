package com.sda.ExceptionExample.Main;

import com.sda.ExceptionExample.negativeSoldException.SoldUtilities;

public class Main {
    public static void main(String[] args) {

        SoldUtilities bankMethods = new SoldUtilities(10);
        bankMethods.draw(1);
    }

}
