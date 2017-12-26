/**
 * @Author stormlin
 * @DATE 2017/12/26
 * @TIME 11:04
 * @PROJECT Algorithm
 */

public class QuickSort {

    /**
     * 快速排序
     * @param array 待排序数组
     */
    public static void quickSort(int[] array) {
        partition(array, 0, array.length - 1);
    }

    /**
     * 快速排序的递归算法
     * @param array 待排序数组
     * @param left 数组索引下限
     * @param right 数组索引上限
     */
    public static void partition(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        int temp;
        int reference = array[left];
        for (int i = left, j = right; i != j; ) {
            while (j > left && j > i && array[j] > reference) {
                j--;
            }
            while (i < right && i < j && array[i] < reference) {
                i++;
            }
            if (i < j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            } else {
                temp = array[left];
                array[left] = array[i];
                array[i] = temp;
                partition(array, left, i - 1);
                partition(array, i + 1, right);
            }
        }
    }

}
