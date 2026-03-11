package com.advanced.collections.maps;

import java.util.Hashtable;
import java.util.Map;

public class HashlabDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "alexander");
        ht.put(117, "jonny");
        ht.put(128, "siens");
        ht.put(102, "hitler");
        ht.put(100, "madagsar");
        ht.put(99, "FhAa");
        ht.put(98, "lodfr");
        System.out.println(ht.getOrDefault(98,"Not found"));


            System.out.println(ht.getOrDefault(99,"not found"));
            ht.putIfAbsent(100,"mdagasr");
        System.out.println("updated table "+ ht);
        }
    }
