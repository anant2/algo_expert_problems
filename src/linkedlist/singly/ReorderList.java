package linkedlist.singly;

public class ReorderList {

    public Node reorder(Node head){
        Node firstHead = head;
        Node mid = findMiddleNode(head);
        Node secondHead = reverseList(mid);

        while(firstHead != null && secondHead != null) {
            Node newFirstHead = firstHead.next;
            firstHead.next = secondHead;
            firstHead = newFirstHead;

            Node newSecondHead = secondHead.next;
            secondHead.next = firstHead;
            secondHead = newSecondHead;
        }
        return head;
    }

    public Node reverseList(Node node){
        Node prev = null;
        Node current = node;
        Node next = current.next;
        while(current != null) {
            current.next = prev;
            prev = current;
            current = next;
            if(next != null) next = next.next;
        }
        node = prev;
        return node;
    }

    private Node findMiddleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

}
