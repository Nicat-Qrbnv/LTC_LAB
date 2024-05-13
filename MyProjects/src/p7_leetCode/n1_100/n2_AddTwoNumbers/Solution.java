package p7_leetCode.n1_100.n2_AddTwoNumbers;

import p7_leetCode.ListNode;

class Solution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        ListNode listNode = addTwoNumbers(l1, l2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return summation(l1, l2, new ListNode(0));
    }

    public static ListNode summation(ListNode l1, ListNode l2, ListNode head) {
        int a = l1 == null ? 0 : l1.val;
        int b = l2 == null ? 0 : l2.val;

        int sum = a + b + head.val;
        head.val = sum % 10;

        if (l1 != null || l2 != null) {
            head.next = new ListNode(sum / 10);
            ListNode l1n = l1 == null ? l1 : l1.next;
            ListNode l2n = l2 == null ? l2 : l2.next;
            summation(l1n, l2n, head.next);
        }
        return head;
    }
}