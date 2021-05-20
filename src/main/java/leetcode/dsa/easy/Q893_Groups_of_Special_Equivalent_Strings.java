package leetcode.dsa.easy;

import java.util.*;

public class Q893_Groups_of_Special_Equivalent_Strings {
    public int numSpecialEquivGroups(String[] words) {

    int tempCount = 0, maxCount = 0;
    List<String> wordList = Collections.synchronizedList(new ArrayList<>());
    Arrays.stream(words).forEach(wordList::add);

        for (int i = 0; i < wordList.size()-1 ; i++) {
            Set<Integer> set1 = new HashSet<>();
            wordList.get(i).chars().forEach(set1::add);
            for (int j = i+1; j < wordList.size() ; j++) {
                Set<Integer> set2 = new HashSet<>();
                wordList.get(j).chars().forEach(set2::add);

                /*Possible prey :p */
                if(set1.equals(set2)) {
                    if(isTargetSpecialEquivalent(wordList.get(i).toCharArray(),wordList.get(j))) {
                        tempCount ++;
                        wordList.remove(j);
                    }
                }
            }
            wordList.remove(i);
            maxCount = tempCount > maxCount ? tempCount : maxCount;
        }
        return maxCount;
    }

    private boolean isTargetSpecialEquivalent(char[] s, String target) {
        int size = s.length;

        for(int i = 0; i < size; i=i+4) {
            if(i+2 < size) {
                if(swap(s,i, i+2).equals(target) )
                    return true;
            }
            if(i+3 < size) {
                if(swap(s, i+1, i+3).equals(target))
                    return true;
            }
        }
        return false;
    }

    private String swap(char[] s, int i, int j) {
        char t = s[i];
        s[i] = s [j];
        s[j] = t;
        return s.toString();
    }
}
