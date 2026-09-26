package leetcode;

import java.util.LinkedList;

class ReverseLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    // Insert at end

    private void insert(int data) {

        Node newData = new Node(data);
        if(head ==null)
        {
            head = newData;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
         temp = temp.next;
        }
        temp.next = newData;
    }


    // Display list
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Reverse linked list
    public void reverse() {
        Node prev = null;
        Node cur = head;
        while(cur != null)
        {
          Node next = cur.next;
          cur.next = prev;
          prev = cur;
          cur = next;
        }
        head = prev;
    }

    public void removeDuplicates() {
        Node cur = head;
        while (cur != null && cur.next != null) {
            if (cur.data == cur.next.data) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
    }
     public static void main(String[] args) {
         System.out.println("Start");
         ReverseLinkedList list = new ReverseLinkedList();

         // Insert elements
         list.insert(1);
         list.insert(2);
         list.insert(3);
         list.insert(4);
         list.insert(5);

         System.out.println("Original List:");
         list.display();

         // Reverse list
         list.reverse();

         System.out.println("Reversed List:");
         list.display();

         ReverseLinkedList list1 = new ReverseLinkedList();

         // Insert elements
         list1.insert(1);
         list1.insert(1);
         list1.insert(1);
         list1.insert(1);
         list1.insert(2);

         System.out.println("Remove duplicates");
         list1.display();
         list1.removeDuplicates();
         System.out.println("After Remove duplicates");
         list1.display();


     }


}