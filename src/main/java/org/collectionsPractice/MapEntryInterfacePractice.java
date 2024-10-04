package org.collectionsPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntryInterfacePractice {
    //The Map.Entry interface in Java is an inner interface of the Map interface. It represents a key-value pair (an entry) in a Map. The Map.Entry interface provides methods to retrieve and manipulate these pairs within a map.
    //
    //Key Methods of Map.Entry
    //getKey(): Returns the key corresponding to this entry.
    //getValue(): Returns the value corresponding to this entry.
    //setValue(V value): Replaces the value corresponding to this entry with the specified value.


    private static void printMapEntry() {
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);

        // Using entrySet() to iterate over the map
        Set<Map.Entry<String, Integer>> entries = studentGrades.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            String student = entry.getKey();
            Integer grade = entry.getValue();
            System.out.println(student + ": " + grade);
        }

    }


    private static   void updateConfigMapUsingMapEntry(){
        Map<String, String> config = new HashMap<>();
        config.put("timeout", "30");
        config.put("theme", "light");
        config.put("language", "en");

        // New configuration to apply
        Map<String, String> updates = new HashMap<>();
        updates.put("timeout", "60");
        updates.put("theme", "dark");

        // Applying updates
        Set<Map.Entry<String, String>> entries = config.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            if (updates.containsKey(key)) {
                entry.setValue(updates.get(key));
            }
        }

        // Printing the updated configuration map
        for (Map.Entry<String, String> entry : config.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    private static void manupulateUsingMapEntry() {

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Math", 85);
        scores.put("English", 90);
        scores.put("Science", 75);

        // Increasing each score by 5%
        Set<Map.Entry<String, Integer>> entries = scores.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            entry.setValue(entry.getValue() + (entry.getValue() * 5 / 100));
        }

        // Printing the updated map
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        printMapEntry();
        manupulateUsingMapEntry();
        updateConfigMapUsingMapEntry();
    }

}
