package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> insertArray = new ArrayList<>();

      //  for (int i = 1; i <= 5; i++) {
           // insertArray.add(i);
       // }

       // Collections.shuffle(insertArray);
        insertArray.add(4);
        insertArray.add(3);
        insertArray.add(2);
        insertArray.add(10);
        insertArray.add(12);
        insertArray.add(1);
        insertArray.add(5);
        insertArray.add(6);
        insertSort(insertArray, insertArray.size());

        System.out.println(insertArray);
    }

    public static void insertSort(ArrayList<Integer> a, int size) {
        int numSorted = 1;

        while (numSorted < size) {
            int temp = a.get(numSorted);
            int locationSpot = binarySort(a, temp, 0, numSorted - 1); // uses numSorted - 1 because the index goes from 0 - n-1

            for (int index = numSorted - 1; index >= locationSpot; --index) { // moves ever element from the locationSpot to the origional location up 1
                a.set(index + 1, a.get(index));
            }
            a.set(locationSpot, temp); // sets the destined location
            numSorted++;
        }
    }

    public static int binarySort(ArrayList<Integer> a, int item, int low, int high) {
        int mid = (high + low) / 2; // finding the middle point

        //base case - when the indeces are usually 0,0
        if (high <= low) {
            if (item > a.get(low)) {
                return low + 1;
            } else {
                return low;
            }
        }
        if (a.get(mid) == item) {
            return mid + 1;
        }
        if (a.get(mid) > item) {
            return binarySort(a, item, low, mid);
        } else {
            return binarySort(a, item, mid + 1, high);
        }
    }
}
