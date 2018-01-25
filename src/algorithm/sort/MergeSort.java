package algorithm.sort;

/**
 * Created by stormlin on 2017-12-26.
 */
public class MergeSort {

    /**
     * 归并排序入口
     * @param array 待排序数组，结果从大到小排序
     */
    public static void mergeSort(int array[]) {

        int[] temp = new int[array.length];

        sort(array, 0, array.length - 1, temp);

    }

    private static void sort(int array[], int low, int high, int[] temp) {

        if (low < high) {
            int mid = (high + low) / 2;
            sort(array, low, mid, temp);
            sort(array, mid + 1, high, temp);
            merge(array, low, mid, high, temp);
        }

    }

    private static void merge(int array[], int low, int mid, int high, int[] temp) {

        int i = low;
        int j = mid + 1;
        int k;

        for (k = 0; i <= mid && j <= high; k++) {
            if (array[i] > array[j]) {
                temp[k] = array[i++];
            } else {
                temp[k] = array[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }

        while (j <= high) {
            temp[k++] = array[j++];
        }

        k = 0;

        for (int l = low; l <= high; l++, k++) {
            array[l] = temp[k];
        }

    }

}
