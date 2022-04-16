// Runtime: 3 ms, faster than 79.97% of Java online submissions for Swapping Nodes in a Linked List.
// Memory Usage: 57.4 MB, less than 83.41% of Java online submissions for Swapping Nodes in a Linked List.

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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode kl = null;
        ListNode kr = null;
        ListNode tmpNode = head;
        
        int size = 0;
        while (tmpNode != null) {
            ++size;
            tmpNode = tmpNode.next;
        }
        
        if (size == 1)  return head;
        
        tmpNode = head;
        for (int i = 1; kl == null || kr == null;  ++i) {
            if (i == k) {
                kl = tmpNode;
            }
            
            if ((size - (i - 1)) == k) {
                kr = tmpNode;
            }
            
            tmpNode = tmpNode.next;
        }
        
        int tmp = kl.val;
        kl.val = kr.val;
        kr.val = tmp;
        
        return head;
    }
}
