package org.mitesh.collections;
import java.util.*;
/*
Java TreeMap class implements the Map interface by using a tree. It provides an efficient means of storing key/value pairs in sorted order.

The important points about Java TreeMap class are:

    A TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
    It contains only unique elements.
    It cannot have null key but can have multiple null values.
    It is same as HashMap instead maintains ascending order.

    HashMap
        1) HashMap can contain one null key.
        2) HashMap maintains no order.
    TreeMap
        1) TreeMap can not contain any null key.
        2) TreeMap maintains ascending order.
 */
public class TreeMapCollection {

    public static void main(String args[]) {

        //puts in order
        TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(102, "Ravi");
        hm.put(101, "Vijay");
        hm.put(103, "Rahul");

        System.out.println("Before removal: ");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        hm.remove(102);
        System.out.println("post removal: " + hm);


    }
}
