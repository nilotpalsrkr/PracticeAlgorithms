package leetcode.dsa.medium;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/generate-parentheses/
 */
public class Q22GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> resultList = new ArrayList<>();
        parenthesisBacktrack(resultList,"", 0, 0, n);
        return resultList;
    }

    public void parenthesisBacktrack(List<String> resultList, String result, int openParenCount, int closeParenCount, int max) {
        if(result.length() == max *2) {
            resultList.add(result);
            return;
        }
        if(openParenCount < max) {
            parenthesisBacktrack(resultList, result + "{", openParenCount +1, closeParenCount, max);
        }
        if(closeParenCount < openParenCount) {
            parenthesisBacktrack(resultList, result +"}", openParenCount, closeParenCount+1, max);
        }
    }

}
