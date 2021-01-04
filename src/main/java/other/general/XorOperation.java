package other.general;

public class XorOperation {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;
        int num3 = 1;
        int num4 = 2;
        int xor1 = num1 ^ num2;
        int xor2 = xor1 ^ num3;
        int xor3 = xor2 ^ num4;
        System.out.println(String.format("num2 = %d",xor1^num1));
        System.out.println(String.format("num3 = %d", xor2^num1^num2));
        System.out.println(String.format("num4 = %d", xor3^num1^num2^num3));

        System.out.println(String.format("num2 = %d",xor1^num1));
        System.out.println(String.format("num3 = %d", xor2^num1^num2));
        System.out.println(String.format("num4 = %d", xor3^num1^num2^num3));
    }
}
