// Runtime: 4 ms, faster than 97.93% of Java online submissions for Palindrome Linked List.
// Memory Usage: 48.7 MB, less than 96.37% of Java online submissions for Palindrome Linked List.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        int n = head.val;
        int i = 10;
        
        while (head.next != null) {
            n = (n * 10) + head.next.val;
            head.next.val = (head.next.val * i) + head.val;
            head = head.next;
            i *= 10;
        }
        
        return n == head.val;
    }
}