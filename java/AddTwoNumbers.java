import utils.ListNode;

import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *      int val;
 *      ListNode next;
 *      ListNode() {}
 *      ListNode(int val) { this.val = val; }
 *      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        LinkedList<Integer> ln1 = new LinkedList<>();
        LinkedList<Integer> ln2 = new LinkedList<>();

        if (l1 != null) {
            while (l1 != null) {
                ln1.add(l1.val); 
                l1 = l1.next;
            }
        }

        if (l2 != null) {
            while (l2 != null) {
                ln2.add(l2.val);
                l2 = l2.next;
            }
        }

        ListNode newNode = new ListNode(0);
        ListNode curr = newNode;
        int sum = 0;
        while (!ln1.isEmpty() || !ln2.isEmpty() || sum != 0) {

            if (!ln1.isEmpty()) {
                sum += ln1.poll();
            }

            if (!ln2.isEmpty()) {
                sum += ln2.poll();
            }

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            sum /= 10;
        }

        return newNode.next;
    }
}