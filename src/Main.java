import javax.lang.model.type.ArrayType;
import javax.tools.Tool;
import java.util.Arrays;

/**
 * @Author stormlin
 * @DATE 2017/12/26
 * @TIME 10:28
 * @PROJECT Algorithm
 */

public class Main {

    public static void main(String[] args) {

        //int[] testCase = {12, 13, 6, 29, 6, 24, 50, 18, 17, 38};
        int[] testCase = Tools.getRandomIntegerArray(1, 100, 30);

        System.out.println(Arrays.toString(testCase));

        QuickSort.quickSort(testCase);

        System.out.println(Arrays.toString(testCase));

    }

}
