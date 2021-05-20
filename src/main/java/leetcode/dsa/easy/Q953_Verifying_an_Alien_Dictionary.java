package leetcode.dsa.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Q953_Verifying_an_Alien_Dictionary {
    Map<Character, Integer> map = new HashMap<>();
    public boolean isAlienSorted(String[] words, String order) {
        boolean status = true;
        int i = 0;
        for(char c : order.toCharArray()) {
            map.putIfAbsent(c, i++);
        }
        int maxLength = 0;
        for(String word : words){
            maxLength = word.length() > maxLength ? word.length() : maxLength;
        }

        for(int j = 0; j< maxLength ; j++) {
            for(int k =0; k < maxLength ; k++) {
                if(!compare(words[j].charAt(j), words[k].charAt(k))) {
                    status = false;
                }
            }
        }
        return status;
    }

    private boolean compare(char charAtj, char charAtk) {
        return map.get(charAtj) <= map.get(charAtk);
    }
}
