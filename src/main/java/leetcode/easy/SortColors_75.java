package leetcode.easy;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
* Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
* with the colors in the order red, white, and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
* */
public class SortColors_75 {
    public void sortColors(Integer[] nums) {
        List<Integer> distinctElements = Arrays.asList(nums).stream().distinct().collect(Collectors.toList());
        Map<Integer, FunctionIntialIndex> elementIndexMap = new HashMap<>();
        int lastColor = -1;
        for(int i = 0; i < distinctElements.size() ; i++) {
            int dElement = distinctElements.get(i);
            if (i != distinctElements.size() - 1) {
                elementIndexMap.put(dElement, new FunctionIntialIndex(i, x -> x + 1));

            } else {
                elementIndexMap.put(dElement, new FunctionIntialIndex(nums.length - 1, x -> x));
                lastColor = dElement;

            }

        }

        for(int i = 0 ; i < nums.length ; ) {
           FunctionIntialIndex functionIntialIndex = elementIndexMap.get(nums[i]);
           if(functionIntialIndex.initialIndex != i) {
               int tempIndex = functionIntialIndex.function.apply(functionIntialIndex.initialIndex);
               swap(nums, i, elementIndexMap.get(nums[i]).initialIndex);
               functionIntialIndex.setInitialIndex(tempIndex);
               //elementIndexMap.put(nums[i], functionIntialIndex);
           } else {

               functionIntialIndex.setInitialIndex(functionIntialIndex.function.apply(i));
               //elementIndexMap.put(nums[i], functionIntialIndex );
               i++;
           }
        }

    }
    private void swap(Integer[] arr, int index1, int index2) {
        Integer temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    private static class FunctionIntialIndex {
        Integer initialIndex;
        Function<Integer, Integer> function;

        public FunctionIntialIndex(Integer initialIndex, Function<Integer, Integer> function) {
            this.initialIndex = initialIndex;
            this.function = function;
        }

        public Integer getInitialIndex() {
            return initialIndex;
        }

        public void setInitialIndex(Integer initialIndex) {
            this.initialIndex = initialIndex;
        }

        public Function<Integer, Integer> getFunction() {
            return function;
        }

        public void setFunction(Function<Integer, Integer> function) {
            this.function = function;
        }
    }
}
