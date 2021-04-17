package shulikov.leetcode.easy._206_Reverse_Linked_List;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode prevNode = null;
        ListNode currentNode = null;
        ListNode nextNode = head;

        while (nextNode != null) {
            currentNode = nextNode;
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
        }

        return currentNode;
    }
}
