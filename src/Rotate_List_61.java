import Helper.ListNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Mert Ozer
 *
 * Given a linked list, rotate the list to the right by k places, where k is non-negative.

Example 1:

Input: 1->2->3->4->5->NULL, k = 2
Output: 4->5->1->2->3->NULL
Explanation:
rotate 1 steps to the right: 5->1->2->3->4->NULL
rotate 2 steps to the right: 4->5->1->2->3->NULL
Example 2:

Input: 0->1->2->NULL, k = 4
Output: 2->0->1->NULL
Explanation:
rotate 1 steps to the right: 2->0->1->NULL
rotate 2 steps to the right: 1->2->0->NULL
rotate 3 steps to the right: 0->1->2->NULL
rotate 4 steps to the right: 2->0->1->NULL
 */
public class Rotate_List_61 {
    public ListNode rotateRight(ListNode head, int k) {
        int length = 0;
        ListNode count = head;
        while(count != null){
            length++;
            count = count.next;
        }
        k = k % length;

        Queue<ListNode> queque = new LinkedList();

        for(int i = 0; i < length-k; i++){
            queque.add(head);
            head = head.next;
        }
        ListNode result = head;
        for(int i = 0; i < k-1; i++){
            result = result.next;
        }

        for(int i = 0; i < length-k; i++){
            ListNode nextEl = queque.remove();
            result.next = nextEl;
            result = result.next;
        }
        return head;
    }
}