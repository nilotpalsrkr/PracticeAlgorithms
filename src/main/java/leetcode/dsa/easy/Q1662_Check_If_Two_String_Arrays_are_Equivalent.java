package leetcode.dsa.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Q1662_Check_If_Two_String_Arrays_are_Equivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        return Arrays.stream(word1).collect(Collectors.joining()).equals( Arrays.stream(word2).collect(Collectors.joining()));
    }
}
