package leetcode.dsa.easy;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q3_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int i = 0, j = 0;
        Map<Character, Integer> map = new HashMap<>();
        while( i < s.length() && j< s.length()) {

            if(!map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), j);
                j++;
                length = Math.max(length, j-i);
            } else {

                while(i< map.get(s.charAt(j))) {
                    map.remove(s.charAt(i++));
                }
                map.remove(s.charAt(i++));

            }

        }
        return length;
    }
}
