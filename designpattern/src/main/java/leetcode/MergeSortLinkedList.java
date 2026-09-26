package leetcode;

public class MergeSortLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int v) { this.val = v; }
        ListNode(int v, ListNode n) { this.val = v; this.next = n; }
    }

    // Main merge sort function
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        // Split list using slow/fast pointers
        ListNode slow = head, fast = head, prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;  // cut the list into two halves

        // Recursively sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        // Merge the sorted halves
        return merge(left, right);
    }

    // Merge two sorted lists
    private static ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(-1), current = dummy;

        while (a != null && b != null) {
            if (a.val <= b.val) {
                current.next = a;
                a = a.next;
            } else {
                current.next = b;
                b = b.next;
            }
            current = current.next;
        }

        current.next = (a != null) ? a : b;
        return dummy.next;
    }

    // Demo
    public static void main(String[] args) {
        ListNode n5 = new ListNode(1);
        ListNode n4 = new ListNode(3, n5);
        ListNode n3 = new ListNode(2, n4);
        ListNode n2 = new ListNode(5, n3);
        ListNode n1 = new ListNode(4, n2);

        ListNode sorted = sortList(n1);
        while (sorted != null) {
            System.out.print(sorted.val + (sorted.next != null ? " -> " : "\n"));
            sorted = sorted.next;
        }
    }
}