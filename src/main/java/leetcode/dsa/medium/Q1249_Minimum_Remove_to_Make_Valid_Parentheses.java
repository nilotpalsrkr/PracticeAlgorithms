package leetcode.dsa.medium;

import com.sun.tools.javac.util.StringUtils;

import java.util.EmptyStackException;
import java.util.Stack;

public class Q1249_Minimum_Remove_to_Make_Valid_Parentheses {
    public String minRemoveToMakeValid(String s) {
        int i = 0;
        Stack<Element> stack = new Stack<>();
        int possibleIndex = -1;
        while( i < s.length()) {
            Character c = s.charAt(i);
            try {
                if (c == '(') {
                    stack.push(new Element(c, i));
                } else if (c == ')' && stack.peek().c == '(') {
                    stack.pop();
                } else if(c == ')'){
                    stack.push(new Element(c, i));
                }
            }catch (EmptyStackException e) {
                stack.push(new Element(c, i));
            }
            i++;
        }
        StringBuilder sb = new StringBuilder(s);
        while(!stack.empty()) {
            Element element = stack.pop();
           sb.deleteCharAt(element.index);
        }
        return sb.toString();
    }
    class Element {
        Character c;
        int index;
        public Element(Character c, int index) {
            this.c = c;
            this.index = index;
        }
    }
}
