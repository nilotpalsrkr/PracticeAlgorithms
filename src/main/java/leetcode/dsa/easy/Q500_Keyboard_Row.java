package leetcode.dsa.easy;

import java.util.*;
import java.util.stream.Collectors;

public class Q500_Keyboard_Row {
    static Map<Integer, Integer> map = new HashMap<>();
    static {
        "qwertyuiop".chars().forEach(x -> map.put(x,1));
        "asdfghjkl".chars().forEach(x -> map.put(x,2));
        "zxcvbnm".chars().forEach(x -> map.put(x,3));

    }
    public String[] findWords(String[] words) {
        List<String> resultList = new ArrayList<>();
        for(String s : words) {
            if(s.chars().map(x -> map.get(Character.toLowerCase(x))).boxed().collect(Collectors.toSet()).size() == 1)
                resultList.add(s);
        }
        String[] strings = new String[resultList.size()];
        return resultList.toArray(strings);
    }
}
