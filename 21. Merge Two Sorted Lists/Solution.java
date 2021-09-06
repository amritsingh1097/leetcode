// Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
// Memory Usage: 38.5 MB, less than 48.72% of Java online submissions for Merge Two Sorted Lists.

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if (l1 == null && l2 == null)   return null;
        if (l1 != null && l2 == null)   return l1;
        if (l1 == null && l2 != null)   return l2;
        
        
        ListNode tmp;
        if (l1.val <= l2.val) {
            tmp = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            tmp = new ListNode(l2.val);
            l2 = l2.next;
        }
        
        ListNode list = tmp;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tmp.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                tmp.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            
            tmp = tmp.next;
        }
        
        if (l1 != null) tmp.next = l1;
        if (l2 != null) tmp.next = l2;
        
        return list;
    }
}