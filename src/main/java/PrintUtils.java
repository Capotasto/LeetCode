/**
 * Created by Capotasto on 7/17/17.
 */
public class PrintUtils {

    public static void print(int[] nums) {
        System.out.print("Result: ");
        for (int num : nums) {
            System.out.print(num + ", ");
        }
    }

    public static void printTime(long start, long stop) {
       System.out.printf("Time: %f ms", (stop - start) / 1000000f);
    }
}
