package leetcode.dsa.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q1352_Product_of_the_Last_K_Numbers {
    List<Integer> prod = new LinkedList<>();
    Integer zeroIndex;
    int size = 0;
    public Q1352_Product_of_the_Last_K_Numbers() {

    }

    public void add(int num) {
        if(num == 0)  {
            zeroIndex = size ;
            prod.add(0);
        }
        else {
            if(size != 0) {
                int n = prod.get(size - 1) == null || prod.get(size - 1) == 0 ? 1 : prod.get(size - 1);
                prod.add(n * num);
            }
            else {
                prod.add(num);
            }

        }
        size++;
    }

    public int getProduct(int k) {
    int index = prod.size() - k;
    if(zeroIndex!= null && index<=zeroIndex) return 0;
    int divisor = 1;
    try {
        divisor = prod.get(index - 1) == 0 ? 1 : prod.get(index - 1); //Substracting 1 because we need to get the product at 1 pocket before k-index
    }
    catch (IndexOutOfBoundsException e) {}
    return prod.get(size-1)/divisor;
    }
}

