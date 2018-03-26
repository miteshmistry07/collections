package org.mitesh.collections;
import java.util.*;

public class TestCollection14 {

    public static void main(String args[]) {
        //It is same as HashMap instead maintains insertion order.
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        hm.put(99, "mitesh");

        System.out.println("Values before remove: "+ hm);

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        // Remove value for key 102
        hm.remove(102);
        System.out.println("Values after remove key 102: "+ hm);

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
