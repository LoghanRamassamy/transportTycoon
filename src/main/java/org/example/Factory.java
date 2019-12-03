package org.example;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    Map<String, Integer> hm;

    public Factory() {
        this.hm = new HashMap<>();
        hm.put("A", 5);
        hm.put("B", 4);
    }

    public int shipTo(String warehouse) {

        if ("A".equals(warehouse))
            return 5;
        return 4;
    }
}
