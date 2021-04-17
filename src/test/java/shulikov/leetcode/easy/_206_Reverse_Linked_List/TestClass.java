package shulikov.leetcode.easy._206_Reverse_Linked_List;

import org.junit.Assert;
import org.junit.Test;


public class TestClass {

    Solution solution = new Solution();

    @Test
    public void example_1() {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode listNode = solution.reverseList(head);
        Assert.assertEquals(4, listNode.val);
        Assert.assertEquals(3, listNode.next.val);
        Assert.assertEquals(2, listNode.next.next.val);
        Assert.assertEquals(1, listNode.next.next.next.val);
    }
}
