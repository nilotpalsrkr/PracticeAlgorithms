package leetcode.dsa.medium;

import java.util.HashSet;
import java.util.Set;

public class Q159_Longest_Substring_with_At_Most_Two_Distinct_Characters {

    public int lengthOfLongestSubstringTwoDistinct(String s) {

        int i = 0, j =0;
        Set<Character> set = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        int length = 0;
        while(i<s.length() && j<s.length()) {
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                length = Math.max(length, j-i);
            }
            else if(!set2.contains(s.charAt(j))) {
                set2.add(s.charAt(j++));
                length = Math.max(length, j-i);
            }
            else {
                set.remove(s.charAt(i--));

            }
        }

        return length;
    }
}
