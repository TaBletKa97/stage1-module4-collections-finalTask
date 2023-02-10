package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();
        sourceMap.keySet().forEach(k -> {
            int length = k.length();
            resultMap.computeIfAbsent(length, k1 -> new HashSet<>());
            resultMap.get(length).add(k);
        });
        return resultMap;
    }
}
