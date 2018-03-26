package org.mitesh.collections;
import java.util.*;

public class TestCollection1 {

    public static void main(String args[]) {

        ArrayList<String> list=new ArrayList<String>();//Creating arraylist

        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        //Traversing list through Iterator
        Iterator itr=list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    /*
        Type Parameters - The type parameters naming conventions are important to learn generics thoroughly.
                          The commonly type parameters are as follows:

        T - Type
        E - Element
        K - Key
        N - Number
        V - Value

        Website: https://www.javatpoint.com/generics-in-java
     */
}
