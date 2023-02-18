package by.trayan.algorithms.leetcode.chapter1;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;


class MiddleLinkedListTest {

    @Test
    void middleNode() {
        final MiddleLinkedList.ListNode head = new MiddleLinkedList.ListNode(1,
                new MiddleLinkedList.ListNode(2,
                        new MiddleLinkedList.ListNode(3,
                                new MiddleLinkedList.ListNode(4,
                                        new MiddleLinkedList.ListNode(5,
                                                null)))));

        final MiddleLinkedList.ListNode middleHead = MiddleLinkedList.findMiddleNode(head);

        Assert.isTrue(middleHead.val == 3, "");
        Assert.isTrue(middleHead.next.val == 4, "");
        Assert.isTrue(middleHead.next.next.val == 5, "");
    }
}