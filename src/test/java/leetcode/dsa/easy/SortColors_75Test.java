package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class SortColors_75Test {

    @Test
    void sortColors() {
        Integer[] arr = {3,3,4,6};
        SortColors_75 sortColors_75 = new SortColors_75();
        sortColors_75.sortColors(arr);
        getIndexOfNthElement(arr, 1, 2);
        assertTrue(validateAllArranged(arr));
    }

    private int getIndexOfNthElement(Integer[] arr, int element, int nth) {
        List<Integer> listOfIndexMatching = IntStream.rangeClosed(0,arr.length-1).filter(i -> arr[i] == element).boxed().collect(Collectors.toList());
        try {
        return listOfIndexMatching.get(nth-1);
        }
        catch (IndexOutOfBoundsException i) {
            return -1;
        }
    }
    private boolean validateAllArranged(Integer[] nums) {
        System.out.println(Arrays.asList(nums));
        List<Integer> distinctElements = Arrays.asList(nums).stream().distinct().collect(Collectors.toList());
        Map<Integer, Integer> mapElemetMark = new HashMap<>();
        distinctElements.stream().forEach(x -> mapElemetMark.put(x, 1));
        for(int i = 1; i< nums.length ; i++) {
            if(mapElemetMark.get(nums[i]) < 0) return false;
            if(nums[i] != nums[i-1]) {
                mapElemetMark.put(nums[i-1], -mapElemetMark.get(nums[i-1]));
            }
            else {
                mapElemetMark.put(nums[i], mapElemetMark.get(nums[i])+ 1);
            }
        }
        return true;
    }
}