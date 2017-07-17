/**
 * Created by Capotasto on 7/17/17.
 */
public class Main {
    private static long start;
    public static void main(String[] args) {
        long start = System.nanoTime();
        executeTowSum();
        long stop = System.nanoTime();

        PrintUtils.printTime(start, stop);
    }

    private static void executeTowSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
//        int[] result1 = TowSum.answer1(nums, target);
        int[] result2 = TowSum.answer2(nums, target);
        PrintUtils.print(result2);
    }
}
