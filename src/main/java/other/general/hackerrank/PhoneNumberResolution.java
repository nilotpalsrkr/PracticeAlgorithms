package other.general.hackerrank;

public class PhoneNumberResolution {
    static String parseDistrict(String phonenum) {

    Integer number = Integer.parseInt(phonenum.split("-")[0]);
    String result;
    if(isMystic(number)) {
        result = "Mystic";
    }
    else if(isValor(number)) {
        result = "Valor";
    }
    else if(forbidden(number)) {
        result = "Forbidden";
    }
    else result = "Instinct";

    return result;

    }

    private static boolean isMystic(Integer num) {
        return num == 101;
    }
    private static boolean isValor(int num) {
        int sum = 0;
        while(num>0) {
            sum = sum + num%10;
            num /=10;
        }
        return sum == 5;
    }
    private static boolean forbidden(int num) {
        boolean b = true;
       while(num>0) {
           b = b && isPrime(num%10);
           num /=10;
       }
    return b;
    }
    private static boolean isPrime(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        return !flag;
    }
}
