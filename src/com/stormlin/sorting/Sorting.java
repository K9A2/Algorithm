package com.stormlin.sorting;

/**
 * 用静态方法的形式记录了一些经典的排序算法。
 * 包括：1.冒泡排序-bubbleSort
 *      2.快速排序-quickSort
 *      3.插入排序-insertionSort
 *      4.选择排序-selectionSort
 *      5.堆排序-heapSort
 *      6.归并排序-mergeSort
 *      7.基数排序-radixSort
 *      8.希尔排序-shellSort
 *
 * Created by stormlin on 2017/5/27.
 */
public class Sorting {

    //冒泡排序
    public static void bubbleSort(int nums[], int length) {
        for (int i = 0; i < length; length--) {
            for (int j = i; j < length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    //快速排序
    // todo:简化此算法，特别是两个while，sorting.c尚未提交git
    public static void quickSort(int nums[], int left, int right) {
        if (left > right) {
            return;
        }
        int temp = 0;
        int reference = nums[left];
        for (int i = left, j = right; i != j; ) {
            while (j > left && j > i && nums[j] >= reference) {
                j--;
            }
            while (i < right && i < j && nums[i] <= reference) {
                i++;
            }
            if (i < j) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            } else {
                temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                quickSort(nums, left, i - 1);
                quickSort(nums, i + 1, right);
            }
        }
    }

    //插入排序
    //todo:添加文档
    public static void insertionSort(int nums[], int length) {
        for (int i = 1; i < length; i++) {
            for (int j = i - 1; j >= 0 && nums[j] > nums[j + 1]; j--) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
        }
    }

    //选择排序
    //todo:添加对应文档
    public static void selectionSort(int nums[], int length) {
        //外循环：控制排序进程
        for (int i = 0, j = 0, k = 0, min = nums[0]; i < length; i++) {
            //内循环：控制插入过程
            for (j = i, min = nums[i], k = i; j < length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    k = j;
                }
            }
            nums[k] = nums[i];
            nums[i] = min;
        }
    }

    //堆排序
    public static void heapSort(int nums[], int length) {
    }

    //归并排序
    public static void mergeSort(int nums[], int length) {
    }

    //基数排序
    public static void radixSort(int nums[], int length) {
    }

    //希尔排序
    //todo:添加说明文档
    public static void shellSort(int nums[], int length) {
        for (int i = 0, j = 0, step = length / 2; step != 0; step /= 2)
        {
            //重复计算步长
            for (i = step; i < length; i++)
            {
                //控制排序进行次数
                for (j = i - step; j >= 0 && nums[j] > nums[j + step]; j -= step)
                {
                    //进行插入排序
                    int temp = nums[j];
                    nums[j] = nums[j + step];
                    nums[j + step] = temp;
                }
            }
        }
    }

}
