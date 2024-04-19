package linkedlist.singly;

public class RotateList {

    public Node rotate(Node head , int k) {
        if(k <= 0 || head == null) return head;
        int length = 1;
        Node last = head;
        while(last.next != null) {
            last = last.next;
            length++;
        }
        last.next = head;
        int skip = length - ( k % length);
        Node newEnd = head;
        for(int i = 0; i < skip - 1; i++) {
            newEnd = newEnd.next;
        }
        head = newEnd.next;
        newEnd.next = null;
        return head;
    }

}
