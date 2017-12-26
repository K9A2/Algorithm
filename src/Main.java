import java.util.Arrays;

/**
 * @Author stormlin
 * @DATE 2017/12/26
 * @TIME 10:28
 * @PROJECT Algorithm
 */

public class Main {

    public static void main(String[] args) {

        int[] testCase = {7, 6, 5, 4, 3, 2, 1};
        int target = 50;

        QuickSort.quickSort(testCase);

        System.out.println(Arrays.toString(testCase));

    }

}
