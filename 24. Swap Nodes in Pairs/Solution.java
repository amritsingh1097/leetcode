// Runtime: 0 ms, faster than 100.00% of Java online submissions for Swap Nodes in Pairs.
// Memory Usage: 36.2 MB, less than 99.46% of Java online submissions for Swap Nodes in Pairs.

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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            int tmp = curr.val;
            curr.val = curr.next.val;
            curr.next.val = tmp;
            
            curr = curr.next.next;
        }
        
        return head;
    }
}