package com.interviewpractice;

public class ArrayMethods {
    public static void main (String[] args){
        int[] array = {1, 5, 0, 2, 7, 9};
        int[] array2 = {1, 2, 0, 2, 7, 9};
        System.out.print("Original Array 1: ");
        print(array);
        System.out.print("\nOriginal Array2: ");
        print(array2);
        System.out.println("\nMax: " + (findMax(array)));
        System.out.print("Reversed: ");
        print(reverseArray(array));
        System.out.print("\nInserted: ");
        print(insertAt(array, 5, 2));
        System.out.println("\nCommon Items in Array1 and Array2: " + commonItems(array, array2));

    }
    //Insert an item to the array at a given index location
    public static int[] insertAt(int[] array, int item, int index){
        int[] newArray = new int[array.length+1];
        for (int i = 0; i<index; i++){
            newArray[i] = array[i];
        }
        newArray[index] = item;
        for(int j = index+1; j<newArray.length; j++){
            newArray[j] = array[j-1];
        }
        return newArray;
    }

    //reverse the given Array
    public static int[] reverseArray(int[] array){
        int count = array.length-1;
        int[] array2 = new int[array.length];
        for(int i = 0; i<array.length && count>=0; i++){
            array2[i] = array[count];
            count--;
        }
        return array2;
    }

    //find common items in two arrays and return them in a String format
    public static String commonItems(int[] array1, int[] array2){
        String list = "";
        for(int i = 0; i<array1.length; i++){
            for(int j = 0; j<array2.length; j++){
                if (array1[i]==array2[j]){
                    list+=array1[i];
                    list+=" ";
                    break;
                }
            }
        }
        return list;
    }

    //find the Max number if an array
    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 1; i<array.length; i++){
            if (array[i]>max)
                max = array[i];
        }
        return max;
    }

    //print the array
    public static void print(int[] array){
        for(int i= 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
