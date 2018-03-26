package org.mitesh.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
//https://www.javatpoint.com/java-8-features
//collections -
// https://www.javatpoint.com/collections-in-java

    public static void main(String[] args) {
	// write your code here
       // List<String> ls = new List<String>();
        /*
        Dog dog = new Dog();
        Cat cat = new Cat();

        List<ISpeak> animalsThatTalk = new ArrayList<ISpeak>();

        animalsThatTalk.add(dog);
        animalsThatTalk.add(cat);

        for (ISpeak ispeak : animalsThatTalk)
        {
            System.out.println(ispeak.talk() + " " + ispeak.howDoIPoo()  + " " + ispeak.somevalue);
        }
        */
        Address address1=new Address("gzb","UP","india");
        Address address2=new Address("gno","GJ","india");

        Emp e=new Emp(111,"varun",address1);
        Emp e2=new Emp(112,"arun",address2);

        e.display();
        e2.display();
    }


}
