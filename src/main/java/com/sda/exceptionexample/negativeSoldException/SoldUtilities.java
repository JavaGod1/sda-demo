package com.sda.exceptionexample.negativeSoldException;

public class SoldUtilities {
    private int sold;

    public SoldUtilities(int sold) {
        this.sold = sold;
    }

    public void draw(int sum) throws SoldException {
        sold -= sum;
        if (sold < 0) {
            throw new SoldException();
        } else {
            System.out.println("Sold cont = " + sold);
        }
        System.out.println("Transaction finished");
    }

    public void drawWithTry(int sum) {
        try {
            sold -= sum;
            if (sold < 0)
                throw new SoldException();
        } catch (SoldException e) {
            System.out.println(e);
        } finally {
            System.out.println("Transaction finished!");
        }
    }
}
