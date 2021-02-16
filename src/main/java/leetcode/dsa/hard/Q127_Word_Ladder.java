package leetcode.dsa.hard;

import com.sun.tools.javac.util.Pair;

import java.lang.reflect.Array;
import java.util.*;

public class Q127_Word_Ladder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<>();
        Set<String> set = new HashSet<>(wordList);
        queue.remove(beginWord);
        queue.add(beginWord);
        int level = 0;

        while(!queue.isEmpty()) {
            level++;
            int size = queue.size();
            for(int i = 0; i< size ; i++) {
                String element = queue.poll();
                if (endWord.equals(element)) return level;
                Set<String> neighbours = getNeighbours(element,set);
                for (String neigh : neighbours) {
                    set.remove(neigh);
                    queue.add(neigh);
                }
                set.remove(element);
            }
        }
        return 0;
    }

    public Set<String> getNeighbours(String element, Set<String> wordList) {
        Set<String> result = new HashSet<>();
        char[] chars = element.toCharArray();
        for(int i = 0; i <element.length(); i++) {
            char temp = chars[i];
            for(char c = 'a'; c <='z'; c++) {
                chars[i] = c;
                String newString = new String(chars);
                if(!newString.equals(element) && wordList.contains(newString)) result.add(newString);
            }
            chars[i] = temp;
        }
        return result;
    }
}
