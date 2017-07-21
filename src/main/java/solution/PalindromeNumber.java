package solution;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        int n = x;
        long rev = 0;
        while (x > 0) {
            int dig = x % 10;
            rev = rev * 10 + dig;
            if (rev > Integer.MAX_VALUE) {
                //Over fall
                return false;
            }
            x = x / 10;
        }
        return n == rev;
    }
}
