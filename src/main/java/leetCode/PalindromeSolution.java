package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 2. Palindrome Number
 *
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 *
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 *
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 * Constraints: -231 <= x <= 231 - 1
 *
 * Follow up: Could you solve it without converting the integer to a string?
 */
class PalindromeSolution {
    /**
     * Solution 1 - Best solution
     */
    public boolean isPalindrome(int x) {
        char[] xToCharArray = String.valueOf(x).toCharArray();

        for (int i = 0; i < xToCharArray.length / 2; i++) {
            if (xToCharArray[i] != xToCharArray[xToCharArray.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Solution 2
     */
    /*public boolean isPalindrome(int x) {
        String original = String.valueOf(x);
        String reverse = new StringBuilder(original).reverse().toString();
        return original.equals(reverse);
    }*/

    public static void main(String[] args) {
        int x = 121;
        boolean result = new PalindromeSolution().isPalindrome(x);
        System.out.printf("result=%s", result);
    }
}

