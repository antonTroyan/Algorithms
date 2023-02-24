package by.trayan.algorithms.leetcode.two_pointers;

import by.trayan.algorithms.ListNode;
import by.trayan.algorithms.leetcode.two_pointers.MiddleLinkedList;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;


class MiddleLinkedListTest {

    @Test
    void middleNode() {
        final ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));

        final ListNode middleHead = MiddleLinkedList.findMiddleNode(head);

        Assert.isTrue(middleHead.val == 3, "");
        Assert.isTrue(middleHead.next.val == 4, "");
        Assert.isTrue(middleHead.next.next.val == 5, "");
    }
}