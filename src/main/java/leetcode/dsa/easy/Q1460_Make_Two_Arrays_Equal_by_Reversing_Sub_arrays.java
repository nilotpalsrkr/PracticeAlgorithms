package leetcode.dsa.easy;

import java.util.Arrays;

public class Q1460_Make_Two_Arrays_Equal_by_Reversing_Sub_arrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        int sizeTarget = target.length;
        int sizeArr = arr.length;
        if(sizeArr != sizeTarget) return false;

        Arrays.sort(target);
        Arrays.sort(arr);

        if(Arrays.equals(target,arr)) return true; else return false;

    }
}
