package leetcode.dsa.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1640_Check_Array_Formation_Through_Concatenation {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> map = new HashMap<>();

        for(int[] peice : pieces) {
            map.put(peice[0], peice);
        }
        boolean canFormArray = true;
        for(int i = 0; i< arr.length;) {
            int[] peice = map.get(arr[i]);
            if(peice == null) {
                canFormArray = false; break;
            }
            if(!Arrays.equals(Arrays.copyOfRange(arr, i, i +peice.length), peice)){
                canFormArray = false;
                break;
            }
            i = i+ peice.length;
        }
        return canFormArray;
    }


}
