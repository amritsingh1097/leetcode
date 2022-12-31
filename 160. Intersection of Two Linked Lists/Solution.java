/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode n1 = headA;
        ListNode n2 = headB;
        int sizeA = 0;
        int sizeB = 0;

        while (n1 != null) {
            ++sizeA;
            n1 = n1.next;
        }

        while (n2 != null) {
            ++sizeB;
            n2 = n2.next;
        }
        
        if (sizeA >= sizeB) {
            n1 = headA;
            n2 = headB;
            
        } else {
            n1 = headB;
            n2 = headA;
        }

        int diff = Math.abs(sizeA - sizeB);
        for (int i = 0; i < diff; ++i) {
            n1 = n1.next;
        }

        while (n1 != n2) {
            n1 = n1.next;
            n2 = n2.next;
        }

        return n1;
    }
}
