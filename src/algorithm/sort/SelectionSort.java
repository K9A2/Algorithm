package algorithm.sort;

/**
 * Created by stormlin on 2017-12-26.
 */
public class SelectionSort {

    /**
     * 选择排序，从大到小排列结果
     *
     * @param array 待排序数组
     */
    public static void selectionSort(int array[]) {

        int i;
        int j;

        // 以 k，min 保存选出来的最小值
        int k, min;

        // 已排序的元素个数逐渐增加
        for (i = 0; i < array.length; i++) {
            // 找到最小的元素及其下标
            for (j = i, min = array[i], k = i; j < array.length; j++) {
                if (array[j] > min) {
                    min = array[j];
                    k = j;
                }
            }
            // 把选出来的元素交换到其最终位置
            array[k] = array[i];
            array[i] = min;
        }
    }

}
