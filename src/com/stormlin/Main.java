package com.stormlin;

import com.stormlin.sorting.Sorting;

public class Main {

    public static void main(String[] args) {

        int a[] = {5, 4, 3, 2, 1};

        Sorting.shellSort(a, a.length);

        for (int item : a) {

            System.out.println(item);

        }

    }
}