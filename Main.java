package com.gnoori;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.LinkedList;

public class Main {
    public static void main (String[] args) {

        //utilizing Array class created from scratch
        /*
        Array number = new Array(3);
        number.insert(10);
        number.insert(20);
        number.insert(20);
        number.insert(40);
        number.removeAt(0);
        System.out.println(number.indexOf(20));
        number.print();*/

        //utilizing ArrayList built in methods
        /*
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.remove(1);
        list.indexOf(10);
        //index of last occurrence of the item
        list.lastIndexOf(20);
        list.contains(10);
        list.size();
        list.toArray();
        System.out.println(list);
         */

        //utilizing built in LinkedList functions
        /*
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.removeLast();
        list.removeFirst();
        System.out.println(list.contains(10));
        System.out.println(list.indexOf(10));
        System.out.println(list.size());
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
        */

        //utilizing Linked List class methods crated from scratch
        /*
        var list = new LinkedList();
        System.out.println(list.size());
        list.addLast(5);
        list.addLast(10);
        list.addLast(15);
        list.addFirst(0);
        list.removeFirst();
        list.removeLast();
        System.out.println(list.indexOf(40));
        System.out.println(list.contains(5));
        System.out.println(list.size());
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
         */
    }
}
