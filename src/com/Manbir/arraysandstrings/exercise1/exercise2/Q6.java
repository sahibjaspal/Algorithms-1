package com.Manbir.arraysandstrings.exercise1.exercise2;

public class Q6 {
//    Write a function that takes in an Integer array and returns a list of indexes where null is present.

    public static void main(String[] args) {
        Integer[] arr1 = new Integer[] {1,23,4, null, 5,6,7,null,7,8,null};
        nullIndex(arr1);

    }

    public static void nullIndex(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("null at index: " + i);
            }
        }

    }
}
