package leetcode.dsa.medium;

import java.text.DecimalFormat;

public class Q50_Pow {
    public double myPow(double x, int n) {

        if(n==0) return 1;

        if(n<0) return 1/x * myPow(x, ++n);
        if(n==1) return x;

        else return x * myPow(x, n-1);
    }

}
