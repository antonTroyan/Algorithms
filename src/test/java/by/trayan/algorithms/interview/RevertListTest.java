package by.trayan.algorithms.interview;

import by.trayan.algorithms.ListNode;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class RevertListTest {

    @Test
    void reverseList() {

        // correct order
        final ListNode elementR1 = new ListNode(6);
        final ListNode elementR2 = new ListNode(5);
        final ListNode elementR3 = new ListNode(4);
        final ListNode elementR4 = new ListNode(3);
        final ListNode elementR5 = new ListNode(2);
        final ListNode elementR6 = new ListNode(1);

        // init
        elementR1.next = elementR2;
        elementR2.next = elementR3;
        elementR3.next = elementR4;
        elementR4.next = elementR5;
        elementR5.next = elementR6;

        // correct order
        final ListNode element1 = new ListNode(1);
        final ListNode element2 = new ListNode(2);
        final ListNode element3 = new ListNode(3);
        final ListNode element4 = new ListNode(4);
        final ListNode element5 = new ListNode(5);
        final ListNode element6 = new ListNode(6);
        // init
        element1.next = element2;
        element2.next = element3;
        element3.next = element4;
        element4.next = element5;
        element5.next = element6;

        Assert.isTrue(RevertList.compareLists(RevertList.reverseList(element1), elementR1), "");
    }
}