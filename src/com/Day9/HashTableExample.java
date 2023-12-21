package com.Day9;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        // Create a HashTable to store key-value pairs
        Hashtable<String, Integer> scores = new Hashtable<>();

        // Add key-value pairs to the HashTable
        scores.put("John", 90);
        scores.put("Jane", 85);
        scores.put("Alice", 95);

        // Access values in the HashTable
        int johnScore = scores.get("John");
        System.out.println("John's score: " + johnScore);

        // Update a value in the HashTable
        scores.put("Jane", 88);
        System.out.println("Updated scores: " + scores);

        // Remove a key-value pair from the HashTable
        scores.remove("Alice");
        System.out.println("HashTable after removal: " + scores);

        // Check if a key exists in the HashTable
        boolean containsKey = scores.containsKey("Jane");
        System.out.println("Contains Jane? " + containsKey);

        // Check if a value exists in the HashTable
        boolean containsValue = scores.containsValue(90);
        System.out.println("Contains 90? " + containsValue);

        // Get the size of the HashTable
        int size = scores.size();
        System.out.println("Size of the HashTable: " + size);

        // Iterate over the HashTable
        System.out.println("Iterating over the HashTable:");
        for (String key : scores.keySet()) {
            int value = scores.get(key);
            System.out.println(key + ": " + value);
        }

        // Clear the HashTable
        scores.clear();
        System.out.println("HashTable after clearing: " + scores);
    }
}
