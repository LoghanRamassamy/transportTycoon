package org.example;

public class Factory {
    public int ship(String arg) {
        if (arg.equals("A"))
            return 5;
        return 4;
    }
}
