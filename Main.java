package com.gnoori;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.LinkedList;

public class Main {
    public static void main (String[] args) {
        //Time complexity Examples
        /*
    public void log(int[] numbers){
        System.out.println(numbers[0]); //O(1)
    }
    public void log2(int[] numbers, String[] names){
        //Total run-time complexity is O(1+n+1) => O(2+n) => O(n)
        System.out.println(); //O(1)
        for (int i = 0; i<numbers.length; i++)
            System.out.println(numbers[i]); //O(n)
        System.out.println(); //O(1)

        //Total run-time complexity is O(n+n) => O(2n) ==> O(n)
        for (int i = 0; i<numbers.length; i++)
            System.out.println(numbers[i]); //O(n)
        for (int i = 0; i<numbers.length; i++)
            System.out.println(numbers[i]); //O(n)

        //Total run-time complexity is O(n+m) => O(n)
        for (int i = 0; i<numbers.length; i++)
            System.out.println(numbers[i]); //O(n)
        for (String name: names)
            System.out.println(name); //O(m)
    }
    public void log3(int[] numbers){
        //Total run-time complexity is O(n*n) => O(n^2)
        for(int first: numbers){ //O(n)
            for(int second: numbers){ //O(n)
                System.out.println(first+ ", " + second);
            }
        }

        //Total run-time complexity is O(n+(n*n)) => O(n+n^2) => O(n^2)
        for(int number: numbers){//O(n)
            System.out.println(number);
        }
        for(int first: numbers){ //O(n)
            for(int second: numbers){ //O(n)
                System.out.println(first+ ", " + second);
            }
        }
        //Total run-time complexity is O(n*n*n) => O(n^3)
        for(int first: numbers){ //O(n)
            for(int second: numbers){ //O(n)
                for(int third: numbers) { //O(n)
                    System.out.println(first + ", " + second);
                }
            }
        }
    }*/

        //Space complexity examples
        /*
    public void greet(String[] names){
        //loop variable space is O(1), because initially assigned to constant 0
        for (int i = 0; i<names.length; i++){
            System.out.println("Hi " + names[i]);
        }
        //copy variable space is O(n). Because it needs space as mush as the input size
        String[] copy = new String[names.length];
    }*/

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
        /*var list = new LinkedList();
        System.out.println(list.size());
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addFirst(0);
        list.removeFirst();
        list.removeLast();
        System.out.println(list.indexOf(5));
        System.out.println(list.contains(5));
        System.out.println(list.size());
        list.reverse();
        System.out.println(list.indexOf(5));
        var array = list.toArray();
        System.out.println(list.getKthFromEnd(0));
        System.out.println(Arrays.toString(array));*/

    }
}
