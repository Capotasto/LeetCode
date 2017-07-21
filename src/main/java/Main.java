import solution.PalindromeNumber;
import solution.ReverseInteger;
import solution.RomanToInteger;
import solution.TowSum;

public class Main {

    public static void main(String[] args) {
        long start = System.nanoTime();
//        executeTowSum();
//        executeReverseInteger();
//        executePalindromeNumber();
        executeRomanToInteger();
        long stop = System.nanoTime();

        PrintUtils.printTime(start, stop);
    }

    private static void executeTowSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
//        int[] result1 = solution.TowSum.answer1(nums, target);
        int[] result2 = TowSum.answer2(nums, target);
        PrintUtils.print(result2);
    }

    private static void executeReverseInteger() {
        int x1 = 999999999;
        int result = ReverseInteger.answer1(x1);
        PrintUtils.print(result);
    }

    private static void executePalindromeNumber() {
        int x = -2147447412;
        boolean result = PalindromeNumber.isPalindrome(x);
        PrintUtils.print(result);
    }

    private static void executeRomanToInteger() {
        String string = "MCMX";
        int result = RomanToInteger.answer1(string);
        PrintUtils.print(result);
    }
}
