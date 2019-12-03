package org.example;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    Map<String, Integer> hm = new HashMap<>();

    public int shipTo(String warehouse) {
        hm.put("A", 5);
        hm.put("B", 4);
        if ("A".equals(warehouse))
            return 5;
        return 4;
    }
}
