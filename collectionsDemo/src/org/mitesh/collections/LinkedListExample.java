package org.mitesh.collections;

import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) {

        //Creating list of Books
        List<Book> list = new LinkedList<Book>();

        //Creating Books
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);

        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);

        //Traversing list
        for (Book b : list) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }

    /*
        ArrayList
            1) ArrayList internally uses dynamic array to store the elements.
            2) Manipulation with ArrayList is slow because it internally uses array. If any element is removed from the array, all the bits are shifted in memory.
            3) ArrayList class can act as a list only because it implements List only.
            4) ArrayList is better for storing and accessing data.

        LinkedList
            1) LinkedList internally uses doubly linked list to store the elements.
            2) Manipulation with LinkedList is faster than ArrayList because it uses doubly linked list so no bit shifting is required in memory.
            3) LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
            4) LinkedList is better for manipulating data.
     */
}
