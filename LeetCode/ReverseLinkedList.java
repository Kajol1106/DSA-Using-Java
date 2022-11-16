package LeetCode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null) {
            //for store the value before break the node of curr and curr.next
            ListNode temp = curr.next;
            //declare curr.next = null;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
