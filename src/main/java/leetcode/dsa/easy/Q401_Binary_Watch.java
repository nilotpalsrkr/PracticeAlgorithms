package leetcode.dsa.easy;

import java.util.ArrayList;
import java.util.List;

public class Q401_Binary_Watch {
    public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i<12; i++) {
            for(int j=0; j <60; j++) {
                if(hammingDistance(i) + hammingDistance(j) == num) {
                    result.add(String.format("%d:%02d", i, j));
                }
            }
        }
        return result;
    }

    private int hammingDistance(int i) {
        int temp = i;
        int count =0;
        while(temp > 0) {
            temp = temp & (temp-1);
            count++;
        }
        return count;
    }
}
