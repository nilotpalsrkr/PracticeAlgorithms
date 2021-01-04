package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q50_PowTest {

    @Test
    void myPow() {
        Q50_Pow q50_pow = new Q50_Pow();

        double result = q50_pow.myPow(2.0, 10);

        assertEquals(1024.0000, result);
    }

    @Test
    void myPow2() {
        Q50_Pow q50_pow = new Q50_Pow();

        double result = q50_pow.myPow(2.100, 3);

        assertEquals(9.26100, result);
    }
    @Test
    void myPow3() {
        Q50_Pow q50_pow = new Q50_Pow();

        double result = q50_pow.myPow(2.000, -2);

        assertEquals(0.25, result);
    }
}