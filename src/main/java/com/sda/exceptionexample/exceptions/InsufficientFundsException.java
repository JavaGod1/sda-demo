package com.sda.exceptionexample.exceptions;

public class InsufficientFundsException extends RuntimeException {

    public InsufficientFundsException() {
        super("insufficient funds!");
    }

}
