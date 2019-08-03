package com.sda.routing;

public class Router implements Connectable {


    @Override
    public boolean connectTo(Network network) {
        return true;
    }

    public void connect(Network network) {

        if (connectTo(network)) {

            System.out.println("You are connected to : " + network + " Netwok");
        }
    }

}
