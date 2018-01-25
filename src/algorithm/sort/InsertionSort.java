package algorithm.sort;

import Utils;

/**
 * Created by stormlin on 2017-12-26.
 */
public class InsertionSort {

    /**
     * 插入排序，从大到小排序
     *
     * @param array 待排序数组
     */
    public static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0 && array[j] < array[j + 1]; j--) {
                Utils.swap(array, j, j + 1);
            }
        }
    }

}
