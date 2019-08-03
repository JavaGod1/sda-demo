package com.sda.exceptionexample.negativeSoldException;

public class SoldUtilities {
    private int sold;

    public SoldUtilities(int sold) {
        this.sold = sold;
    }

    public void draw(int sum) {
        sold -= sum;
        if (sold < 0) {
            try {
                throw new SoldException("Sold negativ!");
            } catch (SoldException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Sold cont = " + sold);
        }
    }
}
