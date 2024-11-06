class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public ListNode mergedList(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode current = head;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }

        return head.next;
    }
}

public class Main {
    public static ListNode toLinkedList(int[] lst) {
        ListNode head = new ListNode(lst[0]);
        ListNode current = head;
        for (int i = 1; i < lst.length; i++) {
            current.next = new ListNode(lst[i]);
            current = current.next;
        }
        return head;
    }

    public static int[] toArray(ListNode node) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        while (node != null) {
            result.add(node.val);
            node = node.next;
        }
        // Convert ArrayList to int[]
        int[] array = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            array[i] = result.get(i);
        }
        return array;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode list1 = toLinkedList(new int[]{1, 2, 3});
        ListNode list2 = toLinkedList(new int[]{2, 3, 4});

        ListNode merged = sol.mergedList(list1, list2);
        int[] result = toArray(merged);

        // Print the merged list as an array
        System.out.println(java.util.Arrays.toString(result));
    }
}
