package com.sda.routing.exceptions;


//create a custom exception
//        NetworkUnavailableException
//        in enum
//NetworkSignal getSignalByRandomNumber(int input)
//        switch

public class NetworkUnavailableException extends RuntimeException {

    public NetworkUnavailableException(String message) {

        super(message);
    }

}


