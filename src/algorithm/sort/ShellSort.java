package algorithm.sort;

import Utils;

/**
 * Created by stormlin on 2017-12-26.
 */
public class ShellSort {

    /**
     * 希尔排序
     *
     * @param array 待排序数组，结果从大到小排序
     */
    public static void shellSort(int array[]) {
        for (int i, j, step = array.length / 2; step != 0; step /= 2) {
            // 重复计算步长
            for (i = step; i < array.length; i++) {
                // 控制排序进行次数
                for (j = i - step; j >= 0 && array[j] > array[j + step]; j -= step) {
                    // 进行插入排序
                    Utils.swap(array, j, j + step);
                }
            }
        }
    }

}
