package leetcode.dsa.easy;

import java.util.List;

public class Q339_Nested_List_Weight_Sum {
    public int depthSum(List<NestedInteger> nestedList) {
        int sum = 0;
        return getWeightedSum(nestedList, 0, 1);
    }

    private int getWeightedSum(List<NestedInteger> nestedIntegers, int sum, int level) {

        for(NestedInteger nestedInteger : nestedIntegers) {
            if(nestedInteger.isInteger()) {
                sum = sum + nestedInteger.getInteger() * level;
            }
            else {
                sum = sum + getWeightedSum(nestedInteger.getList(), sum, level);
            }
        }
        return sum;
    }
}


  // This is the interface that allows for creating nested lists.
  // You should not implement it, or speculate about its implementation
  interface NestedInteger {


      // @return true if this NestedInteger holds a single integer, rather than a nested list.
      public boolean isInteger();

      // @return the single integer that this NestedInteger holds, if it holds a single integer
      // Return null if this NestedInteger holds a nested list
      public Integer getInteger();

      // Set this NestedInteger to hold a single integer.
      public void setInteger(int value);

      // Set this NestedInteger to hold a nested list and adds a nested integer to it.
      public void add(NestedInteger ni);

      // @return the nested list that this NestedInteger holds, if it holds a nested list
      // Return null if this NestedInteger holds a single integer
      public List<NestedInteger> getList();
  }

