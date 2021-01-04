package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q11_ContainerWithMostWaterTest {

    @Test
    void maxArea() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        Q11_ContainerWithMostWater q11_containerWithMostWater = new Q11_ContainerWithMostWater();
        int area = q11_containerWithMostWater.maxArea(height);
        assertEquals(49, area);
    }
}