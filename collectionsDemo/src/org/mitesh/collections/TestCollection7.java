package org.mitesh.collections;

import java.util.*;

public class TestCollection7 {

    public static void main(String args[]) {

        LinkedList<String> al = new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("the last element is: " + al.getLast());
        System.out.println("indez of the first element is: " + al.indexOf(al.getFirst()));
        System.out.println("index of the last element is: " + al.indexOf(al.getLast()));
    }

}
