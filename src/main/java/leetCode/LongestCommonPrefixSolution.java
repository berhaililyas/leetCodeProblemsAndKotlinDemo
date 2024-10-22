package leetCode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 4. Longest Pommon Prefix
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */
class LongestCommonPrefixSolution {
    /**
     * Solution 1 - Best solution
     */
    public String longestCommonPrefix(String[] strs) {
        StringBuilder commonPrefix = new StringBuilder();

        if (strs.length == 1) {
            return strs[0];
        } else {
            Arrays.sort(strs, Comparator.comparingInt(String::length));
            for (int i = 0; i < strs[0].length(); i++) {
                for (int j = 1; j < strs.length; j++) {
                    if (strs[0].charAt(i) != strs[j].charAt(i)) {
                        return commonPrefix.toString();
                    }

                    if (j == (strs.length - 1)) {
                        commonPrefix.append(strs[0].charAt(i));
                    }
                }
            }
        }

        return commonPrefix.toString();
    }

    /**
     * Solution 2
     */
    /*public String longestCommonPrefix(String[] strs) {
        StringBuilder commonPrefix = new StringBuilder();

        if (strs.length == 1) {
            return strs[0];
        } else {
            Arrays.sort(strs, Comparator.comparingInt(String::length));
            for (int i = 0; i < strs[0].length(); i++) {
                for (int j = 1; j < strs.length; j++) {
                    if (strs[0].charAt(i) != strs[j].charAt(i)) {
                        return commonPrefix.toString();
                    }

                    if (j == (strs.length - 1)) {
                        commonPrefix.append(strs[0].charAt(i));
                    }
                }
            }
        }

        return commonPrefix.toString();
    }*/

    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
//        String[] strs = new String[]{"dog","racecar","car"};
//        String[] strs = new String[]{"racewar","racecar","racebycar","racecarby"};
//        String[] strs = new String[]{"ab","a"};
//        String[] strs = new String[]{"a"};
        String result = new LongestCommonPrefixSolution().longestCommonPrefix(strs);
        System.out.printf("result=%s", result);
    }
}

