package org.example;

public class Factory {
    public int shipTo(String warehouse) {
        if ("A".equals(warehouse))
            return 5;
        return 4;
    }
}
