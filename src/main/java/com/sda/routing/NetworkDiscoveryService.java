package com.sda.routing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NetworkDiscoveryService implements Connectable {

    private Stream<String> networkNames;
    private List<Network> networks = new ArrayList<>();
    private Router router;

    public NetworkDiscoveryService(Router router, Stream<String> networkNames) {
        this.router = router;
        this.networkNames = networkNames;
    }

    public void run() {
        // for each network name, create a network
        // add each new network to the network list
        networkNames.forEach(name ->
                networks.add(new Network(name)));

        // attempt to connect to each network
        networks.forEach(network -> router.connectTo(network));
    }

    // TODO: implement this
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

