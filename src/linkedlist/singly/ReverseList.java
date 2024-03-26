package linkedlist.singly;

//https://leetcode.com/problems/reverse-linked-list-ii/

public class ReverseList {

    public Node reverseSection(Node head , int left, int right) {
        Node previous = null;
        Node current = head;

        for(int i =0; current != null && i< left - 1; i++) {
            previous = current;
            current = current.next;
        }

        Node lastNode = previous;
        Node next = current.next;
        Node newEnd = current;

        for(int i = 0; current != null &&  i < right - left + 1; i++) {
            current.next = previous;
            previous = current;
            current = next;
            if(next != null) next = next.next;
        }

        if(lastNode != null) {
            lastNode.next = previous;
        } else {
            head = previous;
        }

        newEnd.next = current;

        return head;

    }

}
