// Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Two Numbers.
// Memory Usage: 39.4 MB, less than 58.11% of Java online submissions for Add Two Numbers.

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode l = l1;
        
        while (l1 != null || l2 != null) {
            int sum = l1.val + (l2 == null ? 0 : l2.val) + carry;
            
            l1.val = sum % 10;
            carry = sum / 10;
            
            l2 = l2 == null ? null : l2.next;
            l1.next = (l1.next == null && l2 != null) ? new ListNode() : l1.next;
            
            if (l1.next == null && carry == 1) {
                l1.next = new ListNode(1);
                break;
            } else {
                l1 = l1.next;
            }
        }
        
        return l;
    }
}
