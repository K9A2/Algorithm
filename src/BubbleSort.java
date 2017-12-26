/**
 * @Author stormlin
 * @DATE 2017/12/26
 * @TIME 10:46
 * @PROJECT Algorithm
 */

public class BubbleSort {

    /**
     * 冒泡排序算法
     * @param array 待排序数组
     */
    public static void bubbleSort(int array[]) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
