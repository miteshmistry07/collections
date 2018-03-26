package org.mitesh.collections;

import java.util.*;

class TestCollection2 {

    public static void main(String args[]) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("Ravi2");
        al.add("Vijay2");
        al.add("Ravi2");
        al.add("Ajay2");

        for (String obj : al)
            System.out.println(obj);
    }
}

