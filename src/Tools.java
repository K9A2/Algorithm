import java.util.Random;

/**
 * Created by stormlin on 2017-12-26.
 */
public class Tools {

    /**
     * 交换数组中的两个元素
     *
     * @param array 目标元素所在数组
     * @param left  第一个元素的下标
     * @param right 第二个元素的下标
     */
    public static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    /**
     * 产生随机整数
     *
     * @param min 随机数下限
     * @param max 随机数上限
     * @return 结果
     */
    public static int getRandomInteger(int min, int max) {
        Random random = new Random();
        return random.nextInt(max) % (max - min + 1) + min;
    }

    /**
     * 获取随机产生数组的数组
     *
     * @param min    随机数下限
     * @param max    随机数上限
     * @param length 数组长度
     * @return 结果数组
     */
    public static int[] getRandomIntegerArray(int min, int max, int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = Tools.getRandomInteger(min, max);
        }
        return array;
    }

}
