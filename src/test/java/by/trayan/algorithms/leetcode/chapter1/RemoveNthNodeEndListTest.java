package by.trayan.algorithms.leetcode.chapter1;

import by.trayan.algorithms.ListNode;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeEndListTest {

    @Test
    void removeNthFromEnd() {
        final ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));

        RemoveNthNodeEndList.removeNthFromEnd(head, 2);
        Assert.isTrue(head.val == 1, "");
        Assert.isTrue(head.next.val == 2, "");
        Assert.isTrue(head.next.next.val == 3, "");
        Assert.isTrue(head.next.next.next.val == 5, "");
    }
}