package linkedlist.singly;

//https://leetcode.com/problems/palindrome-linked-list/

public class Palindrome {

    public boolean isPalindrome(Node head) {
        Node mid = findMiddleNode(head);
        Node secondHead = reverseList(mid);
        Node reReverse = secondHead;
        while(head != null && secondHead != null) {
            if(head.data != secondHead.data){
                break;
            }
            head = head.next;
            secondHead = secondHead.next;
        }

        Node reversed = reverseList(reReverse);
        return head == null || secondHead ==null;
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

}
