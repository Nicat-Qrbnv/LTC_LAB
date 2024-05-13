package p7_leetCode.n1_100.n19_RemoveNthNodeFromEndOfList;

import p7_leetCode.ListNode;

public class Sloution {
    public static void main(String[] args) {
//        ListNode n5 = new ListNode(5);
//        ListNode n4 = new ListNode(4, null);
//        ListNode n3 = new ListNode(3, n4);
//        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, null);
        System.out.println(removeNthFromEnd(n1, 1));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return start.next;
    }
}
