package com.company.p4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Delhi", 200000);
        map.put("Kolkata", 204030);
        map.put("Delhi", 400000);

        System.out.println(map);
        System.out.println(map.get("Delhi"));
    }
}
