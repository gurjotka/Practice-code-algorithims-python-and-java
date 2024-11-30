class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}

public class Main{

    public  static ListNode createLinkedList(int[] values, int pos) {
        if (values.length == 0) {
            return null;
        }

        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        ListNode cycleNode = null;

        if (pos == 0) {
            cycleNode = head;
        }

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;

            if (i == pos) {
                cycleNode = current;
            }
        }

        if (pos != -1) {
            current.next = cycleNode;
        }

        return  head;

    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] values1 = {3, 4, 0, -4};
        int pos1 = 1;
        ListNode head1 = createLinkedList(values1, pos1);
        System.out.println(sol.hasCycle(head1));

        int[] values2 = {1, 2};
        int pos2 = 0;
        ListNode head2 = createLinkedList(values2, pos2);
        System.out.println(sol.hasCycle(head2));

        int[] values3 = {1};
        int pos3 = -1;
        ListNode head3 = createLinkedList(values3, pos3);
        System.out.println(sol.hasCycle(head3));

    }

}
