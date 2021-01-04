package leetcode.dsa.easy;


/*
* https://leetcode.com/problems/palindrome-linked-list/
* */

public class Q234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode slowPoiter = head;
        int xor = 0;
        int count = 0;
        while(slowPoiter !=null) {
            xor = xor ^ slowPoiter.val;
            slowPoiter = slowPoiter.next;
            count++;
        }

        if(count%2 ==0) {
            if(xor == 0)return true;
            else return false;
        }
        else{
            int counterTillMid = 1;
            ListNode listNodeForOddCount = head;
            int midIndex = count/2 +1;
            while(counterTillMid < midIndex){
                listNodeForOddCount = listNodeForOddCount.next;
                counterTillMid++;
            }
            if(xor == listNodeForOddCount.val) return true;
            else return false;

        }
    }
}
