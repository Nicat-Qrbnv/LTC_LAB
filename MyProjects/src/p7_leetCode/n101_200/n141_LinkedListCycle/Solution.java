package p7_leetCode.n101_200.n141_LinkedListCycle;

import p7_leetCode.ListNode;

public class Solution {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        n1.next = n1;
    }
    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
}
