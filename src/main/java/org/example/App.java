package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Factory factory = new Factory();
        int duration = factory.ship(args[0]);
        System.out.println("Containers " + args[0] + " were delivered in " + duration + " hours.");
    }
}
