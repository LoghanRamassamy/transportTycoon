package org.example;

public class App {
    public static void main(String[] args) {
        Factory factory = new Factory();
        int duration = factory.shipTo(args[0]);
        System.out.println("Containers to warehouse(s) " + args[0] + " were delivered in " + duration + " hours.");
    }
}
