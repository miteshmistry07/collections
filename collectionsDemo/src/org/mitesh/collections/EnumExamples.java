package org.mitesh.collections;

import java.util.*;

enum days {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}

public class EnumExamples {

    public static void main(String[] args) {

        Set<days> set = EnumSet.of(days.Tuesday, days.Wednesday);

        // Traversing elements
        Iterator<days> iter = set.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("all days: ");
        Set<days> set2 = EnumSet.allOf(days.class);
        Iterator<days> iter2 = set2.iterator();

        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }

        System.out.println("none of days: ");
        set2 = EnumSet.noneOf(days.class);
        System.out.println("Week Days:"+set2);
    }
}
