package algorithm.sort;

import Utils;

/**
 * Created by stormlin on 2017-12-26.
 */
public class HeapSort {

    /**
     * 堆排序入口，结果从大到小排列
     *
     * @param array 待排序数组
     */
    public static void heapSort(int array[]) {

        

    }

    /**
     * 从下至上的堆有序化（上浮）
     *
     * @param array 待排序数组
     * @param k     需要调整的元素在数组中的下标
     */
    public static void swim(int[] array, int k) {
        while (k > 1 && array[k / 2] < array[k]) {
            Utils.swap(array, k / 2, k);
            k /= 2;
        }
    }

    /**
     * 从上至下的堆有序化（下沉）
     *
     * @param array 待排序数组
     * @param k     需要调整的元素在数组中的下标
     */
    public static void sink(int[] array, int k) {
        while (k * 2 <= array.length) {
            int j = k * 2;
            if (j < array.length && array[j] < array[j + 1]) {
                j++;
            }
            if (!(array[k] < array[j])) {
                break;
            }
            Utils.swap(array, j, k);
            k = j;
        }
    }

}
