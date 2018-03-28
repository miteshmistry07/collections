package org.mitesh.collections;

public class StudentComp implements Comparable<StudentComp> {

	int rollno;
	String name;
	int age;

	StudentComp(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(StudentComp st) {

		if (age == st.age) {
			return 0;
		} else if (age > st.age) {
			return 1;
		} else {
			return -1;
		}
	}

}
