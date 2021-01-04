package leetcode.dsa.easy;

import static org.junit.jupiter.api.Assertions.*;

class ThirdMaximumNumberTest {

    @org.junit.jupiter.api.Test
    void thirdMaxAmongRandomNumbers() {
        int[] inputArray = {1,4,66,22,87};
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        int output = thirdMaximumNumber.thirdMax(inputArray);
       assertEquals(22,output);
    }
    @org.junit.jupiter.api.Test
    void thirdMaxAmongAllNegatives() {
        int[] inputArray = {-1,-2,-3,-4};
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        int output = thirdMaximumNumber.thirdMax(inputArray);
        assertEquals(-3,output);
    }
    @org.junit.jupiter.api.Test
    void thirdMaxAmongAccendingNumbers() {
        int[] inputArray = {1,2,3,4};
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        int output = thirdMaximumNumber.thirdMax(inputArray);
        assertEquals(2,output);
    }
    @org.junit.jupiter.api.Test
    void thirdMaxAmongDescendingNumbers() {
        int[] inputArray = {4,3,2,1};
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        int output = thirdMaximumNumber.thirdMax(inputArray);
        assertEquals(2,output);
    }
    @org.junit.jupiter.api.Test
    void thirdMaxAmongEqualPositiveNumbers() {
        int[] inputArray = {1,1,1,1};
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        int output = thirdMaximumNumber.thirdMax(inputArray);
        assertEquals(1,output);
    }
    @org.junit.jupiter.api.Test
    void thirdMaxAmongEqualNegativeNumbers() {
        int[] inputArray = {-1,-1,-1,-1};
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        int output = thirdMaximumNumber.thirdMax(inputArray);
        assertEquals(-1,output);
    }
    @org.junit.jupiter.api.Test
    void thirdMaxAmongAllZeros() {
        int[] inputArray = {0,0,0,0};
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        int output = thirdMaximumNumber.thirdMax(inputArray);
        assertEquals(0,output);
    }
}