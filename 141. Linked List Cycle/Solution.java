// Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
// Memory Usage: 40 MB, less than 68.02% of Java online submissions for Linked List Cycle.

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        while (head != null) {
            if (head.val == Integer.MIN_VALUE)   return true;
            
            head.val = Integer.MIN_VALUE;
            head = head.next;
        }
        
        return false;
    }
}