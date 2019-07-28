package com.sda.routing;

public class NetworkDiscoveryService implements Connectable {


    public NetworkDiscoveryService(Network network) {

    }

    public static void connectionMethod(Network network) {


    }

    public void printAllConnectedNetworks(Network network) {

        if (connectTo(network)) {
            System.out.println("Available Network : " + network);
        }

    }

    @Override

    public boolean connectTo(Network network) {

        if (network.getSignal() == NetworkSignal.NO_CONNECTION) {

            network.setConnected(false);

            return false;

        } else {

            network.setConnected(false);

            return true;
        }
    }

}

