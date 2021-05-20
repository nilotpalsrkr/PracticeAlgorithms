package leetcode.dsa.easy;

import java.util.Arrays;
import java.util.Comparator;

public class Q14_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
    int k = 0;
    try {
        outer:
            for (k = 0; k < strs[0].length(); k++) {
                char c = strs[0].charAt(k);
                for (int j = 1; j < strs.length; j++) {
                    if (c != strs[j].charAt(k))
                        break outer;
                }
            }
    }catch(IndexOutOfBoundsException e) {}
        return strs[0].substring(0,k);
    }

}
