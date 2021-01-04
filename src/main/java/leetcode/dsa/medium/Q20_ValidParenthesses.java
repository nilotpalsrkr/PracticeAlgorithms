package leetcode.dsa.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Q20_ValidParenthesses {

    public boolean isValid(String s) {
        if(Brackets.getAllOpenBrackets().contains(s.charAt(0)))
        return checkValidParethesis(s, 0, s.charAt(0), 0, 0);
        else return false;
    }

    private boolean checkValidParethesis(String s, int index, int openCharIndex, Integer openBracketCount, Integer closedBracketCount) {
        if (index == s.length()) {
            if (openBracketCount == closedBracketCount)
                return true;
            else return false;
        }
        try {
            if (Brackets.getAllOpenBrackets().contains(s.charAt(index))) {
                return checkValidParethesis(s, index + 1, index, ++openBracketCount, closedBracketCount);
            } else if (Brackets.getAllClosedBrackets().contains(s.charAt(index))) {
                if (Brackets.getOpenBrackerFor(s.charAt(index)).get().openBracket == s.charAt(openCharIndex)) {
                    return checkValidParethesis(s, index + 1, openCharIndex - 1, openBracketCount, ++closedBracketCount);
                } else return false;
            } else return false;
        }catch (StringIndexOutOfBoundsException e) {
            return false;
        }
    }


}

enum Brackets {
    FirstBracket('(',')'),
    SecondBracket('{','}'),
    ThirdBracket('[',']');

    public char openBracket;
    public  char closeBracket;

    private Brackets(char openBracket, char closeBracket){
        this.openBracket = openBracket;
        this.closeBracket = closeBracket;
    }

    public static Optional<Brackets> getOpenBrackerFor(char closeBracket) {
        return Arrays.stream(Brackets.values()).filter(x -> x.closeBracket == closeBracket).findFirst();
    }
    public static Optional<Brackets> getClosedBrackerFor(char openBracket) {
        return Arrays.stream(Brackets.values()).filter(x -> x.closeBracket == openBracket).findFirst();
    }

    public static List<Character> getAllOpenBrackets() {
        return Arrays.stream(Brackets.values()).map(x -> x.openBracket).collect(Collectors.toList());
    }
    public static List<Character> getAllClosedBrackets() {
        return Arrays.stream(Brackets.values()).map(x -> x.closeBracket).collect(Collectors.toList());
    }

}


