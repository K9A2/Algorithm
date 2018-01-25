package com.stormlin.algorithm.sort;

import com.stormlin.util.Utils;

/**
 * @Author stormlin
 * @DATE 2017/12/26
 * @TIME 11:04
 * @PROJECT Algorithm
 */

public class QuickSort {

    /**
     * 快速排序入口
     * @param array 待排序数组
     */
    public static void quickSort(int[] array) {
        partition(array, 0, array.length - 1);
    }

    /**
     * 快速排序的递归算法，从大到小排序
     * @param array 待排序数组
     * @param left 数组索引下限
     * @param right 数组索引上限
     */
    public static void partition(int[] array, int left, int right) {

        // 分治的终结
        if (left >= right) {
            return;
        }

        // 枢轴参考元素
        int reference = array[left];
        int i = left, j = right;

        while (i < j) {
            while (j > i && array[j] <= reference) {
                // 从右往左找第一个比枢轴大的元素
                j--;
            }
            while (i < j && array[i] >= reference) {
                // 从左往右找第一个比枢轴小的元素
                i++;
            }
            Utils.swap(array, i, j);
        }

        Utils.swap(array, left, i);

        // 分治法，在 i 处把数组分成两部分，分别递归调用快速排序算法
        partition(array, left, i - 1);
        partition(array, i + 1, right);
    }

}
