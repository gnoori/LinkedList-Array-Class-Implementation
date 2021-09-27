package com.gnoori;

public class Array {
    private int[] arr;

    //represents the number of items in the array
    private int count;

    //Constructor
    public Array(int length){
        arr = new int[length];
    }

    //Insert an item to the Array
    public void insert(int item){
        if (arr.length == count){
            int[] arr2 = new int[(count*2)];
            for (int i = 0; i<count; i++)
                arr2[i] = arr[i];
            arr = arr2;
        }
        arr[count] = item;
        count++;
    }

    //Remove an item from a certain location
    public void removeAt(int index){
        if (index<0 || index >= count)
            throw new IllegalArgumentException();
        for(int i = index; i<count; i++)
            arr[i] = arr[i+1];
        count--;
    }

    //Return the index of the given item in the Array
    public int indexOf(int item){
        for (int i = 0; i<count; i++)
            if (arr[i]==item)
                return i;
        return -1;
    }

    //Print the items in the Array
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }
}
