package com.sda.routing;

import com.sda.routing.util.RandomGenerator;

public class Network {

    public NetworkSignal signal;
    private String name;
    private boolean connected;

    public Network(String name) {
        this.name = name;
        this.signal = NetworkSignal.getSignalByRandomNumber(RandomGenerator.generateRandomNumber());
        this.connected = false;

        System.out.println("Network name : " + name + "\nnetwork signal : " + signal + "\nnetwork connexion status : " + connected);
    }

    public String getName() {
        return name;
    }

    public NetworkSignal getSignal() {
        return signal;
    }

    public boolean getConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
        System.out.println("\nNetwork name : " + name + "\nnetwork signal : " + signal + "\nnetwork connexion status : " + connected);
    }
}


