package com.sda.routing;

public class RoutingApp {

    public static void main(String[] args) {

        Network network1 = new Network("ASUS1", NetworkSignal.HIGH);

        NetworkDiscoveryService service = new NetworkDiscoveryService(network1);
        service.connectTo(network1);

        System.out.println(network1.getConnected());







    }


}
