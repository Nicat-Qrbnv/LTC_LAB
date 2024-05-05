package p7_leetCode.n401_1500.n876_MiddleOfTheLinkedList;

import p7_leetCode.ListNode;

public class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
