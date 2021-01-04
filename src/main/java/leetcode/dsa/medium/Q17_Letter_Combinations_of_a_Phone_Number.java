package leetcode.dsa.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q17_Letter_Combinations_of_a_Phone_Number {
    private Map<String, String> phone = new HashMap<String, String>() {
        {
            put("2","abc");
            put("3","def");
            put("4","ghi");
            put("5","jkl");
            put("6","mno");
            put("7","pqrs");
            put("8","tuv");
            put("9","wxyz");
        }
    };
    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length() != 0) {
            backtrack("", digits);
        }
        return result;
    }

    private void backtrack(String combination, String nextDigits) {
        if(nextDigits.length() == 0) {
            result.add(combination);
        }
        else {
            String digit = nextDigits.substring(0,1);
            String charectersInDigit = phone.get(digit);
            for(int i = 0; i < charectersInDigit.length() ; i++) {
                String letter  =  charectersInDigit.substring(i, i + 1);
                backtrack(combination + letter, nextDigits.substring(1));
            }
        }
    }

}
