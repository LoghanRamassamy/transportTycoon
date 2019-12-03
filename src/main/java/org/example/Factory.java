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

    public int shipTo(String warehouse) {
        if (warehouse.equals("BB"))
            return 4;
        return shipOneContainer(warehouse);
    }

    private Integer shipOneContainer(String warehouse) {
        return warehouseShipDuration.get(warehouse);
    }
}
