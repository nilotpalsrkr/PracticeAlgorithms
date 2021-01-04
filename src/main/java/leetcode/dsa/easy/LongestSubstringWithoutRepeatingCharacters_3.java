package leetcode.dsa.easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters_3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charecterIndexMap = new HashMap<>();
        int longestLengthYet = 0;
        for (int i = 0, j = 0; j < s.length() ; ) {
            Character currentChar = s.charAt(j);
            if(charecterIndexMap.containsKey(currentChar)) {
                i = Math.max(charecterIndexMap.get(currentChar),i);
            }
            longestLengthYet = Math.max(longestLengthYet, j-i+1);
            charecterIndexMap.put(currentChar, j+1);
            j++;
        }

        return longestLengthYet;
    }
}
