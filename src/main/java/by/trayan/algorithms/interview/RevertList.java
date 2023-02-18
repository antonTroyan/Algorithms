package by.trayan.algorithms.interview;

import by.trayan.algorithms.ListNode;

public class RevertList {

    static void showAll(final ListNode node) {
        ListNode current = node;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    static boolean compareLists(final ListNode node1, final ListNode node2) {
        ListNode current1 = node1;
        ListNode current2 = node2;
        while (current1 != null || current2 != null) {
            if (current1.val != current2.val)
                return false;
            else {
                current1 = current1.next;
                current2 = current2.next;
            }
        }
        return true;
    }

    public static ListNode reverseList(ListNode head) {

        ListNode newListHead = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            // remember next
            next = current.next;
            // change link
            current.next = newListHead;
            // set head for next iteration
            newListHead = current;
            // set next for next iteration
            current = next;
        }
        return newListHead;
    }
}
