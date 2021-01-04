package other.general;

import sun.tools.java.BinaryCode;

import java.math.BigInteger;

public class ShiftOperation {
    public static void main(String[] args) {
        int a = 127;
        int shift = 16;

        long b = 56;
        b = b << 16 << a <<16;
        System.out.println(b);
        BigInteger bigInteger = new BigInteger(String.valueOf(Long.MAX_VALUE));
        System.out.println("bit count :"+bigInteger.bitCount());

        System.out.println(Long.toBinaryString(b));
        System.out.println(b>>shift);
    }

}
