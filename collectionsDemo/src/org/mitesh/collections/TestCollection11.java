package org.mitesh.collections;

import java.util.*;

public class TestCollection11 {

    public static void main(String args[]) {

        //Creating and adding elements
        TreeSet<String> al = new TreeSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        al.add("Mitesh");
        // no duplicates and put them in ascending order

        //Traversing elements
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
