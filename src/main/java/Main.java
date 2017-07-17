/**
 * Created by Capotasto on 7/17/17.
 */
public class Main {
    public static void main(String[] args) {

       exeTowSum();
    }

    private static void exeTowSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = TowSum.answer1(nums, target);

        PrintUtils.print(result);
    }
}
