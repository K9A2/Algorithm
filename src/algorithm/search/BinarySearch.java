package algorithm.search;

/**
 * @Author stormlin
 * @DATE 2017/12/26
 * @TIME 10:17
 * @PROJECT Algorithm
 */

public class BinarySearch {

    /**
     * 二分查找。如果找到了目标元素，则返回它的数组下标，否则返回 -1 表示不存在此元素
     *
     * @param array  待搜索数组
     * @param target 目标元素
     * @return 目标元素的数组下标或者 -1
     */
    public static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length;
        int middle = (low + high) / 2;

        while (low <= high) {
            if (array[middle] == target) {
                return middle;
            } else if (target < array[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
            middle = (low + high) / 2;
        }

        return -1;
    }

}
