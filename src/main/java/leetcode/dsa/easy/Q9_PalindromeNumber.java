package leetcode.dsa.easy;

public class Q9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        int temp = x;
        int revNum = 0;
        if(x < 0) return false;
        while(temp >0) {
            int rem = temp%10;
            revNum = revNum*10 +rem;
            temp/=10;
        }
        if(revNum == x ){
            return true;
        }
        return false;
    }


}
