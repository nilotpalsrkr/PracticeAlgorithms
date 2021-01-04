package leetcode.dsa.medium;
/*
* https://leetcode.com/problems/container-with-most-water/
*/

public class Q11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int limit = height.length;
        int maxArea = 0;
        for(int i = 0; i< limit ; i++){
            for(int j = 0; j< limit;j++){
                int breadth = (j) - (i);
                int length = Math.min(height[i],height[j]);
                maxArea = Math.max(maxArea, length*breadth);
            }
        }
        return maxArea;
    }

}
