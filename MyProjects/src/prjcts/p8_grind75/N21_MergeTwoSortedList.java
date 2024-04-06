package prjcts.p8_grind75;

public class N21_MergeTwoSortedList {
    public static void main(String[] args) {
        ListNode l13 = new ListNode(4);
        ListNode l12 = new ListNode(2, l13);
        ListNode l11 = new ListNode(1, l12);

        ListNode l23 = new ListNode(4);
        ListNode l22 = new ListNode(3, l23);
        ListNode l21 = new ListNode(1, l22);
        ListNode l = mergeTwoLists(l11, l21);
        while (l.next != null) {
            System.out.println(l);
            l = l.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }
        ListNode head = list1.val <= list2.val ? list1 : list2;
        ListNode wait = list1.val >  list2.val ? list1 : list2;
        sort(head, wait);
        return head;
    }

    public static void sort (ListNode head, ListNode wait) {
        if (head.next == null || head.next.val >= wait.val) {
            ListNode temp = head.next;
            head.next = wait;
            wait = temp;
        }
        if (wait != null) {
            sort(head.next, wait);
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        int n = next != null ? next.val : -1;
        return "[" + val + "]->[" + n + "]";
    }
}