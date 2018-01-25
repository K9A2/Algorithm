import java.util.Arrays;

import com.stormlin.algorithm.sort.BubbleSort;
import com.stormlin.util.Utils;

/**
 * @Author stormlin
 * @DATE 2017/12/26
 * @TIME 10:28
 * @PROJECT Algorithm
 */

public class Main {

    public static void main(String[] args) {

        //int[] testCase = {12, 13, 6, 29, 6, 24, 50, 18, 17, 38};
        int[] testCase = Utils.getRandomIntegerArray(1, 100, 30);

        System.out.println(Arrays.toString(testCase));

        BubbleSort.bubbleSort(testCase);

        System.out.println(Arrays.toString(testCase));

    }

}
