package org.mitesh.collections;
import java.util.*;

public class HashTableExample {

    public static void main(String args[]) {
        // create and populate hash table
        Hashtable<Integer, String> map = new Hashtable<Integer, String>();

        map.put(102,"Let us C");
        map.put(103, "Operating System");
        map.put(101, "Data Communication and Networking");

        System.out.println("Values before remove: "+ map);
        // Remove value for key 102
        map.remove(102);
        System.out.println("Values after remove: "+ map);
    }
}

/*
    HashMap	Hashtable

        1) HashMap is non synchronized. It is not-thread safe and can't be shared between many threads without proper synchronization code.
            Hashtable is synchronized. It is thread-safe and can be shared with many threads.

        2) HashMap allows one null key and multiple null values.
            Hashtable doesn't allow any null key or value.
        3) HashMap is a new class introduced in JDK 1.2.
            Hashtable is a legacy class.
        4) HashMap is fast.
            Hashtable is slow.
        5) We can make the HashMap as synchronized by calling this code    Map m = Collections.synchronizedMap(hashMap);
        	Hashtable is internally synchronized and can't be unsynchronized.
        6) HashMap is traversed by Iterator.
            Hashtable is traversed by Enumerator and Iterator.
        7) Iterator in HashMap is fail-fast.
            Enumerator in Hashtable is not fail-fast.
        8) HashMap inherits AbstractMap class.
            Hashtable inherits Dictionary class.

            https://www.javatpoint.com/difference-between-hashmap-and-hashtable
*/