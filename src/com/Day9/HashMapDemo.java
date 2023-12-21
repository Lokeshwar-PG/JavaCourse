package com.Day9;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        System.out.println("HASH MAP");
        Map<String,String> phoneBook = new HashMap<>();
        phoneBook.put("Lokesh", "9677595842");
        phoneBook.put("Sam", "9876543210");
        phoneBook.put("Madhesh", "9081234567");
        phoneBook.put("Rajesh", "9981234565");
        phoneBook.remove("Madhesh");
        String lokeshNo = phoneBook.get("Lokesh");
        System.out.println("Lokesh Phone Number: "+lokeshNo);

        System.out.println("Keys in phoneBook....");
        Set<String> keys;
        keys = phoneBook.keySet();
        for(String key : keys) {
            System.out.println(key.hashCode()+" "+key);
        }

        System.out.println("Key       Value");
        Set<Map.Entry<String,String>> values = phoneBook.entrySet();
        for(Map.Entry<String,String> pair : values) {
            System.out.println(pair.getKey()+" : "+pair.getValue());
        }


        System.out.println("\nHASH TABLE");
        Hashtable<Integer,String> table = new Hashtable<>();
        table.put(1, "Lokesh");
        table.put(3, "Sam");
        table.put(2, "Madhesh");
        table.remove(4);
        System.out.println(table.get(1));
        System.out.println("Keys in Hashtable: ");
        for(Integer key: table.keySet()) {
            System.out.println(key.hashCode() + "\t" + key + "\t" + table.get(key));
        }
    }
}
