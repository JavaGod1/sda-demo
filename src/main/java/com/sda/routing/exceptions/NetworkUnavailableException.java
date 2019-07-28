package com.sda.routing.exceptions;


//create a custom exception
//        NetworkUnavailableException
//        in enum
//NetworkSignal getSignalByRandomNumber(int input)
//        switch

import java.util.Random;

public class NetworkUnavailableException extends RuntimeException {


    public NetworkUnavailableException(String message) {
        super(message);
    }

    Random signalByRandom = new Random();



}


