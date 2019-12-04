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
            return shipTo(warehouses.substring(NUMBER_OF_VEHICULES))
                    + shipOneContainerTo('B')
                    + shipTo(warehouses.substring(warehouses.length() - NUMBER_OF_VEHICULES));
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
