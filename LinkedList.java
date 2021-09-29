package com.gnoori;

import java.util.NoSuchElementException;

public class LinkedList {
    //first node
    private Node first;
    //last node
    private Node last;
    //to keep track of the size of the LinkedList
    private int size;

    private class Node {
        //value of the node
        private int value;
        //reference to the next node
        private Node next;

        //Constructor for Node
        public Node(int value){
            this.value = value;
        }
    }

    //Add items to the end of the LinkedList
    public void addLast(int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            last.next = node;
            last = node;
        }
        size++;
    }

    //Add items to the beginning of the LinkedList
    public void addFirst(int item){
        var node = new Node(item);
        //will be skipped to else, if isEmpty is false
        if(isEmpty())
            first = last = node;
        else{
            node.next = first;
            first = node;
        }
        size++;
    }

    //Return the index of the item in the LinkedList
    public int indexOf(int item){
        int count = 0;
        var current = first;
        while(current!=null) {
            if (current.value == item) {
                return count;
            } else {
                current = current.next;
                count++;
            }
        }
        //if not found, then return -1
        return -1;
    }

    //Check to see if the item exists in the LinkedList
    public boolean contains(int item){
        boolean answer = indexOf(item) != -1;
        return answer;
    }

    //Remove the first element from the LinkedList
    //DONT FORGET garbage collection
    public void removeFirst(){
        //in case the list is empty
        if(isEmpty())
            throw new NoSuchElementException();
        //in case there is only one element in the list
        if(first== last){
            first = last = null;
        } else {
            var second = first.next;
            first.next = null; //will remove the first link
            first = second;
        }
        size--;
    }

    //Remove the last element from the LinkedList
    public void removeLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last){
            last = first = null;
        } else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    //Get the previous element from the LinkedList
    public Node getPrevious(Node node){
        var current = first;
        while(current!=null) {
            if (current.next == node)
                return current;
            else
                current = current.next;
        }
        return null;
    }

    //Return the size of the LinkedList
    //O(1)
    //O(n) if it was traversed
    public int size(){
        return size;
    }

    //Converting LinkedLists to Arrays
    public int[] toArray(){
        int[] newArray = new int[size];
        var current = first;
        var index = 0;
        while(current!=null){
            newArray[index++] = current.value;
            current = current.next;
        }
        return newArray;
    }

    //Reversing Linked List
    public void reverse(){
        //[10 -> 20 -> 30]
        //[p  -> c  -> n]
        if(isEmpty()) return;

        var prev = first;
        var current = first.next;
        while(current!=null){
            var next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        last = first; //makes the first element = last element
        last.next = null;// clears the link from 10 -> 20
        first = prev; // makes the last element = first element


    }
    //Check to see if hte LinkedList is empty
    //private, because we don't want it to be accessible from outside of this class
    private boolean isEmpty(){
        return first == null;
    }
}
