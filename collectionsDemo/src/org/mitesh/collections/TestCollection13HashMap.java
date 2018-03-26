package org.mitesh.collections;

import java.util.*;

public class TestCollection13HashMap {

    public static void main(String args[]) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(102, "Rahul");
        hm.put(101, "Vijay");
        hm.put(103, "Rahul");

        System.out.println("puts in key order and doesn't keep insertion order");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        hm.remove(102);
        System.out.println("removed element 102");

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}
