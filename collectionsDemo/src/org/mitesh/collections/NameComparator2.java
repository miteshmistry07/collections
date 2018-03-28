package org.mitesh.collections;

import java.util.*;

public class NameComparator2 implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}
}
