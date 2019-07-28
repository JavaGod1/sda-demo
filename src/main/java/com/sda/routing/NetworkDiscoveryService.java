package com.sda.routing;

public class NetworkDiscoveryService implements Connectable {

    @Override

    public boolean connectTo(Network network) {

        if (network.getSignal() == NetworkSignal.HIGH || network.getSignal() == NetworkSignal.MEDIUM) {
            return true;
        } else {

            return false;
        }
    }

    public void printAllConnectedNetworks(Network network) {

        if (connectTo(network)) {
            System.out.println("Available Network : " + network);
        }

    }

}

