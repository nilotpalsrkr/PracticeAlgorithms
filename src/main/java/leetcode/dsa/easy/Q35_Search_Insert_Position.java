package leetcode.dsa.easy;

/*
* Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
* 1, 3, 6, 9, 11; target = 2
* */
public class Q35_Search_Insert_Position {

    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int low = 0, high = length-1;
        int mid = (low + high)/2;
        boolean done = false;
        int index = -1;
        while(low<high) {

            if(target == nums[mid]) {
                done = true;
                index = mid;
                break;
            }
            else if(target < nums[mid]) {
                high = mid -1;
            }
            else {
                low = mid +1 ;
            }
            mid = (low + high)/2;
        }
        if(nums[low] == target) {
            index = low;
            done = true;
        }
        if(!done) {
            if(target < nums[low]) index = low;
            else {
                index = low + 1;
            }
        }
        return index;
    }
}
