// Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node From End of List.
// Memory Usage: 40.4 MB, less than 86.76% of Java online submissions for Remove Nth Node From End of List.

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp = head;
        int size = 0;
        while (tmp != null) {
            ++size;
            tmp = tmp.next;
        }
        
        if (n == size) return head.next;
        
        tmp = head;
        for (int i = size-1; i > n; --i) {
            tmp = tmp.next;
        }
        
        tmp.next = tmp.next.next;
        
        return head;
    }
}
