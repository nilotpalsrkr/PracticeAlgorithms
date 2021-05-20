package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1352_Product_of_the_Last_K_NumbersTest {

    @Test
    void test() {
        Q1352_Product_of_the_Last_K_Numbers q1352_product_of_the_last_k_numbers = new Q1352_Product_of_the_Last_K_Numbers();
        q1352_product_of_the_last_k_numbers.add(3);
        q1352_product_of_the_last_k_numbers.add(0);
        q1352_product_of_the_last_k_numbers.add(2);
        q1352_product_of_the_last_k_numbers.add(5);
        q1352_product_of_the_last_k_numbers.add(4);

        int prod1 = q1352_product_of_the_last_k_numbers.getProduct(2);
        assertEquals(20, prod1);

        int prod2 = q1352_product_of_the_last_k_numbers.getProduct(3);
        assertEquals(40, prod2);

        int prod3 = q1352_product_of_the_last_k_numbers.getProduct(4);
        assertEquals(0, prod3);

        q1352_product_of_the_last_k_numbers.add(8);

        int prod4 = q1352_product_of_the_last_k_numbers.getProduct(2);
        assertEquals(32, prod4);
    }
    @Test
    void test1() {
        Q1352_Product_of_the_Last_K_Numbers q1352_product_of_the_last_k_numbers = new Q1352_Product_of_the_Last_K_Numbers();
        q1352_product_of_the_last_k_numbers.add(1);
        int prod1 = q1352_product_of_the_last_k_numbers.getProduct(1);
        assertEquals(1,prod1);

        int prod2 = q1352_product_of_the_last_k_numbers.getProduct(1);
        assertEquals(1,prod2);

        int prod3 = q1352_product_of_the_last_k_numbers.getProduct(1);
        assertEquals(1, prod3);

        q1352_product_of_the_last_k_numbers.add(7);
        q1352_product_of_the_last_k_numbers.add(6);
        q1352_product_of_the_last_k_numbers.add(7);
    }


}