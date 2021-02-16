package leetcode.dsa.easy;

public class Q1539_Kth_Missing_Positive_Number {
    public int findKthPositive(int[] arr, int k) {

        int i = 0;
        int[] found = new int[2001];
        while(i < 2001) {found[i] = 0; i++;}
        i = 0;
        while(i < arr.length) {
           found[arr[i]] = 1;
           i++;
        }
        i = 1;
        int count = 0;
        while(i < 2001) {

            if(found[i] == 0) {
                count++;
            }
            if(count == k) return i;
            i++;
        }
        return -1;
    }
}
