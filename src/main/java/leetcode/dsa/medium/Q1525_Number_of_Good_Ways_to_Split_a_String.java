package leetcode.dsa.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

public class Q1525_Number_of_Good_Ways_to_Split_a_String {
    public int numSplits(String s) {
        int result = 0;
        Map<Integer,Integer> set1 = new ConcurrentHashMap<>();
        Map<Integer,Integer> set2 = new ConcurrentHashMap<>();
        for(int i = 0; i < s.length(); i++) {
            IntStream left = s.substring(0,i).chars();
            IntStream right = s.substring(i).chars();
            left.forEach((x) -> set1.put(x,1));
            right.forEach((x) -> set2.put(x,1));
            if(set1.size() == set2.size()) result++;
            set1.forEach(set1::remove);
            set2.forEach(set2::remove);
            //set2 = new HashSet<>();
        }
        return result;
    }
}
