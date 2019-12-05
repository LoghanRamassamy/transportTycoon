package org.example;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.max;

public class Factory {
    public static final int NUMBER_OF_VEHICULES = 2;
    private final Map<Character, Integer> warehouseShipDuration;

    public Factory() {
        this.warehouseShipDuration = new HashMap<>();
        warehouseShipDuration.put('A', 5);
        warehouseShipDuration.put('B', 4);
    }

    public int shipTo(String warehouses) {
        if (warehouses.length() > NUMBER_OF_VEHICULES) {
            int shipFirstContainers = shipTo(warehouses.substring(0, NUMBER_OF_VEHICULES));
            int costOfBackFromB = shipOneContainerTo('B');
            int shipRestOfContainers = shipTo(warehouses.substring(NUMBER_OF_VEHICULES));
            return shipFirstContainers
                    + costOfBackFromB
                    + shipRestOfContainers;
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
