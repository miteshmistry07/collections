package org.mitesh.collections;

import java.util.*;
import java.io.*;

public class Simple2 {

	public static void main(String args[]) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		System.out.println("Sorting by Name...");

		Collections.sort(al, new NameComparator2());

		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("sorting by age...");

		Collections.sort(al, new AgeComparator2());

		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}
/*
 * Comparable	
1) Comparable provides single sorting sequence. In other words, we can sort the collection on the basis of single element such as id or name or price etc.	
2) Comparable affects the original class i.e. actual class is modified.	
3) Comparable provides compareTo() method to sort elements.	
4) Comparable is found in java.lang package.	
5) We can sort the list elements of Comparable type by Collections.sort(List) method.	 	
 	
 	Comparator
1) Comparator provides multiple sorting sequence. In other words, we can sort the collection on the basis of multiple elements such as id, name and price etc.
2) Comparator doesn't affect the original class i.e. actual class is not modified.
3) Comparator provides compare() method to sort elements.
4) Comparator is found in java.util package.
5) We can sort the list elements of Comparator type by Collections.sort(List,Comparator) method.

*/
