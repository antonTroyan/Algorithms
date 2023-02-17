package by.trayan.algorithms.interview;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class RevertListTest {

    @Test
    void reverseList() {

        // correct order
        final RevertList.ListNode elementR1 = new RevertList.ListNode(6);
        final RevertList.ListNode elementR2 = new RevertList.ListNode(5);
        final RevertList.ListNode elementR3 = new RevertList.ListNode(4);
        final RevertList.ListNode elementR4 = new RevertList.ListNode(3);
        final RevertList.ListNode elementR5 = new RevertList.ListNode(2);
        final RevertList.ListNode elementR6 = new RevertList.ListNode(1);

        // init
        elementR1.next = elementR2;
        elementR2.next = elementR3;
        elementR3.next = elementR4;
        elementR4.next = elementR5;
        elementR5.next = elementR6;

        // correct order
        final RevertList.ListNode element1 = new RevertList.ListNode(1);
        final RevertList.ListNode element2 = new RevertList.ListNode(2);
        final RevertList.ListNode element3 = new RevertList.ListNode(3);
        final RevertList.ListNode element4 = new RevertList.ListNode(4);
        final RevertList.ListNode element5 = new RevertList.ListNode(5);
        final RevertList.ListNode element6 = new RevertList.ListNode(6);

        // init
        element1.next = element2;
        element2.next = element3;
        element3.next = element4;
        element4.next = element5;
        element5.next = element6;

        Assert.isTrue(RevertList.compareLists(RevertList.reverseList(element1), elementR1), "");
    }
}