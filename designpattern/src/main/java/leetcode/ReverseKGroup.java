package leetcode;

public class ReverseKGroup {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ReverseKGroup sol = new ReverseKGroup();

        // Create list: 1→2→3→4→5→6→7
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);

        int k = 3;

        System.out.print("Original: ");
        printList(head);

        // head = sol.reverseKGroup(head, k);
        head = sol.reverseKGroupIterativeway(head, k);

        System.out.print("Reversed in K-group: ");
        printList(head);
    }

    private ListNode reverseKGroupIterativeway(ListNode head, int k) {

        if(head==null)
        {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode kNode = dummy;
        for(int i=0; i<k && kNode!=null; i++)
        {
            kNode = kNode.next;
        }
        ListNode previousGroup = dummy.next;
        ListNode nextGroup = kNode.next;

        ListNode current = previousGroup;

return null;
    }

    // Helper to print list (for testing)
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

}
