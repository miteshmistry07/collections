package org.mitesh.collections;

import java.util.*;

public class CollectionsExample {
    public static void main(String a[]) {

        List<String> list = new ArrayList<String>();
        list.add("C");
        list.add("Core Java");
        list.add("Advance Java");
        System.out.println("Initial collection value:" + list);

        Collections.addAll(list, "Servlet", "JSP");
        System.out.println("After adding elements collection value:" + list);

        String[] strArr = {"C#", ".Net"};
        Collections.addAll(list, strArr);
        System.out.println("After adding array collection value:" + list);

        System.out.println("Collections max/min method");

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(46);
        list2.add(67);
        list2.add(24);
        list2.add(16);
        list2.add(8);
        list2.add(12);
        System.out.println("Value of maximum element from the collection: " + Collections.max(list2));
        System.out.println("Value of minimum element from the collection: " + Collections.min(list2));

        //https://www.javatpoint.com/Sorting-in-collection-framework
    }
}
