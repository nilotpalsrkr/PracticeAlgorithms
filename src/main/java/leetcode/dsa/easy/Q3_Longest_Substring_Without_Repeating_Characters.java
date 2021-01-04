package leetcode.dsa.easy;

import java.util.HashSet;
import java.util.Set;

public class Q3_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int i = 0, j = 0;
        Set<Character> set = new HashSet<>();
        while( i < s.length() && j< s.length()) {

            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                length = Math.max(length, j-i);
            } else {
                set.remove(s.charAt(i++));

            }

        }
        return length;
    }
}
