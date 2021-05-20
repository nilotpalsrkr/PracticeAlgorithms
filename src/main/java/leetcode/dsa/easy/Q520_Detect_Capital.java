package leetcode.dsa.easy;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Q520_Detect_Capital {
    public boolean detectCapitalUse(String word) {
        IntPredicate isCapital = s -> Character.isUpperCase(s);
        IntPredicate isSmall = s -> Character.isLowerCase(s);
        return word.chars().allMatch(isCapital)
                || word.chars().allMatch(isSmall)
                || (isCapital.test(word.chars().findFirst().getAsInt()) && word.substring(1,word.length()).chars().allMatch(isSmall));
    }


}
