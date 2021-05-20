package other.general.hackerrank;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Find complete rows with 1 increasing coin.
* Coins - 4
* @
* @@
* @
* Output - 2 (2 complete, 1 is incomplete)
*
* Coins - 6
* @
* @@
* @@@
* Output - 3 (3 complete rows)
*
* */
class Coin {

    /*
     * Complete the 'arrangeCoins' function below.
     *
     * The function accepts LONG_INTEGER_ARRAY coins as parameter.
     */
    private static Map<Long, Integer> map = new HashMap<>();
    public static void arrangeCoins(List<Long> coins) {
       coins.stream().forEach(x -> sum(x));

    }

    private static void sum(Long num) {
        long sum = 0;
        int i = 1;
        boolean done = false;
        int count = 0;
        if(!map.containsKey(num)) {
            while (!done) {
                sum = sum + i;
                count++;
                if (sum > num) {
                    count--;
                    break;
                } else if (sum == num) {
                    break;
                }
                i++;
            }
            map.put(num, count);
        }else {
            count = map.get(num);
        }
        System.out.println(count);
    }

}