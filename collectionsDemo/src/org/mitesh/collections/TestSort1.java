package org.mitesh.collections;

import java.util.*;

public class TestSort1 {

	public static void main(String args[]) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("viru");
		al.add("saurav");
		al.add("mukesh");
		al.add("tahir");
		al.add("apple");

		Collections.sort(al);
		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		sort2();

	}

	private static void sort2() {
		//https://www.javatpoint.com/Sorting-in-collection-frameworks
		//https://www.geeksforgeeks.org/wrapper-classes-java/
		 
		ArrayList al = new ArrayList();
		
		al.add(Integer.valueOf(201));
		al.add(Integer.valueOf(101));
		al.add(230); // internally will be converted into objects as Integer.valueOf(230)
					  // Autoboxing: Automatic conversion of primitive types to the object of their corresponding wrapper classes is known as 
					 // autoboxing. For example – conversion of int to Integer, long to Long, double to Double etc.
		Collections.sort(al);
		Iterator itr = al.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	
}
