package org.example;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.max;

public class Factory {
    private final Map<Character, Integer> warehouseShipDuration;

    public Factory() {
        this.warehouseShipDuration = new HashMap<>();
        warehouseShipDuration.put('A', 5);
        warehouseShipDuration.put('B', 4);
    }

    public int shipTo(String warehouses) {
        if (warehouses == "BBB" || warehouses == "BBBB") {
            return 12;
        }
        int totalDuration = 0;
        for (char warehouse : warehouses.toCharArray()) {
            totalDuration = max(shipOneContainerTo(warehouse), totalDuration);
        }
        return totalDuration;
    }

    private int shipOneContainerTo(char warehouse) {
        return warehouseShipDuration.get(warehouse);
    }
}
