package leetcode.dsa.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Q266_Palindrome_Permutation {
    public boolean canPermutePalindrome(String s) {
    boolean result = false;
        Map<Character, Integer> map = new HashMap<>();
        for(Character c : s.toCharArray()) {
            map.computeIfAbsent(c, x -> 0);
            map.computeIfPresent(c , (x,y) -> y+1);
        }

        long streamCount = map.values().stream().filter(x -> x%2 != 0).count();
        if(s.length()%2==0) result = streamCount == 0;
        else result = streamCount == 1;
        return result;
    }
}
