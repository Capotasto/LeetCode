package solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * click to show spoilers.
 *
 * Note:
 * The input is assumed to be a 32-bit signed integer.
 * Your function should return 0 when the reversed integer overflows.
 */


public class ReverseInteger {

    public static int answer1(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
        }
        String test = String.valueOf(Math.abs(x));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < test.length(); i++) {
            list.add(String.valueOf(test.charAt(i)));
        }
        Collections.reverse(list);
        StringBuilder builder = new StringBuilder();
        if (isNegative) {
            builder.append("-");
        }
        for (String s : list) {
            builder.append(s);
        }
        int reverseInt;
        String reverseString = builder.toString();
        try {
            reverseInt = Integer.valueOf(reverseString);
        } catch (NumberFormatException e) {
            return 0;
        }
        return reverseInt;
    }
}
