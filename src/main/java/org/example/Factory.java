package org.example;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    Map<String, Integer> warehouseShipDuration;

    public Factory() {
        this.warehouseShipDuration = new HashMap<>();
        warehouseShipDuration.put("A", 5);
        warehouseShipDuration.put("B", 4);
    }

    public int shipTo(String warehouse) {

        if ("A".equals(warehouse))
            return 5;
        return 4;
    }
}
