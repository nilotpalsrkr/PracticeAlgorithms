package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q234_PalindromeLinkedListTest {

    @Test
    void isPalindrome1() {
        ListNode listNode = new ListNode(1, new ListNode(2));
        Q234_PalindromeLinkedList q234_palindromeLinkedList = new Q234_PalindromeLinkedList();
        boolean actual = q234_palindromeLinkedList.isPalindrome(listNode);
        assertFalse(actual);
    }

    @Test
    void isPalindrome2() {
        ListNode listNode = new ListNode(4, new ListNode(2, new ListNode(2, new ListNode(4))));
        Q234_PalindromeLinkedList q234_palindromeLinkedList = new Q234_PalindromeLinkedList();
        boolean actual = q234_palindromeLinkedList.isPalindrome(listNode);
        assertTrue(actual);
    }
    @Test
    void isPalindrome3() {
        ListNode listNode = new ListNode(4, new ListNode(5, new ListNode(2, new ListNode(4))));
        Q234_PalindromeLinkedList q234_palindromeLinkedList = new Q234_PalindromeLinkedList();
        boolean actual = q234_palindromeLinkedList.isPalindrome(listNode);
        assertFalse(actual);
    }
    @Test
    void isPalindrome4() {
        ListNode listNode = new ListNode(5, new ListNode(3, new ListNode(1, new ListNode(3,new ListNode(5, null)))));
        Q234_PalindromeLinkedList q234_palindromeLinkedList = new Q234_PalindromeLinkedList();
        boolean actual = q234_palindromeLinkedList.isPalindrome(listNode);
        assertTrue(actual);
    }

    @Test
    void isPalindrome5() {
        ListNode listNode = new ListNode(5, new ListNode(3, new ListNode(2, new ListNode(3,new ListNode(5, null)))));
        Q234_PalindromeLinkedList q234_palindromeLinkedList = new Q234_PalindromeLinkedList();
        boolean actual = q234_palindromeLinkedList.isPalindrome(listNode);
        assertTrue(actual);
    }

    @Test
    void isPalindrome6() {
        ListNode listNode = new ListNode(5, new ListNode(3, new ListNode(299, new ListNode(3,new ListNode(5, null)))));
        Q234_PalindromeLinkedList q234_palindromeLinkedList = new Q234_PalindromeLinkedList();
        boolean actual = q234_palindromeLinkedList.isPalindrome(listNode);
        assertTrue(actual);
    }
    @Test
    void isPalindrome7() {
        ListNode listNode = new ListNode(1, new ListNode(3, new ListNode(0, new ListNode(2))));
        Q234_PalindromeLinkedList q234_palindromeLinkedList = new Q234_PalindromeLinkedList();
        boolean actual = q234_palindromeLinkedList.isPalindrome(listNode);
        assertFalse(actual);
    }
}