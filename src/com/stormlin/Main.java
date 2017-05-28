package com.stormlin;

import com.stormlin.sorting.Sorting;

public class Main {

    public static void main(String[] args) {

        int a[] = {5, 4, 3, 2, 1};

        Sorting.mergeSort(a);

        for (int item : a) {

            System.out.println(item);

        }

    }
}
