package com.company;


import java.util.ArrayList;

public class BubbleSort {
    public static void main(String[] args) {
       ArrayList<Integer> testSort = new ArrayList<>();
       testSort.add(1);
       testSort.add(77);
       testSort.add(8);
       testSort.add(4);
       testSort.add(5);
       testSort.add(6);

       bubbleSort(testSort);

       for (int i = 0; i < testSort.size(); i++) {
           System.out.println(testSort.get(i));
       }


    }
    public static void bubbleSort(ArrayList<Integer> list) {
        boolean swapped;
        for (int i = 0; i < list.size() - 1; i++) {
            swapped = false;
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
