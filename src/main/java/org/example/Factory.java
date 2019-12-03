package org.example;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private final Map<String, Integer> warehouseShipDuration;

    public Factory() {
        this.warehouseShipDuration = new HashMap<>();
        warehouseShipDuration.put("A", 5);
        warehouseShipDuration.put("B", 4);
    }

    public int shipTo(String warehouses) {
        int totalDuration = 0;
        for (int i = 0; i < warehouses.length(); i++) {
            totalDuration = shipOneContainerTo(String.valueOf(warehouses.charAt(i)));
        }
        return totalDuration;
    }

    private int shipOneContainerTo(String warehouse) {
        return warehouseShipDuration.get(warehouse);
    }
}
