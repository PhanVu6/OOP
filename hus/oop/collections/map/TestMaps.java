package hus.oop.collections.map;

import java.util.HashMap;
import java.util.Map;

public class TestMaps {

    public static void main(String[] args) {
        // Create a sample map
        Map<Integer, Integer> sampleMap = new HashMap<>();
        sampleMap.put(2, 1); // Key: 2, Value: 1
        sampleMap.put(1, 0); // Key: 1, Value: 0
        sampleMap.put(4, 0); // Key: 4, Value: 0
        sampleMap.put(3, 2); // Key: 3, Value: 2
        System.out.println("Map: " + sampleMap);
        // Test count
        System.out.println("Count: " + Maps.count(sampleMap));

        // Test empty
        Maps.empty(sampleMap);
        System.out.println("Map is empty now: " + sampleMap.isEmpty());

        // Restore sample map
        sampleMap.put(1, 0);
        sampleMap.put(2, 1);
        sampleMap.put(3, 2);
        sampleMap.put(4, 0);

        // Test contains
        System.out.println("Contains key 2: " + Maps.contains(sampleMap, 2));
        System.out.println("Contains key 5: " + Maps.contains(sampleMap, 5));

        // Test containsKeyValue
        System.out.println("Contains key 3 with value 2: " + Maps.containsKeyValue(sampleMap, 3, 2));
        System.out.println("Contains key 4 with value 1: " + Maps.containsKeyValue(sampleMap, 4, 1));

        // Test keySet
        System.out.println("Key Set: " + Maps.keySet(sampleMap));

        // Test values
        System.out.println("Values: " + Maps.values(sampleMap));

        // Test getColor
        System.out.println("Color of value 0: " + Maps.getColor(0));
        System.out.println("Color of value 1: " + Maps.getColor(1));
        System.out.println("Color of value 2: " + Maps.getColor(2));
        System.out.println("Color of value 3: " + Maps.getColor(3));
    }
}
