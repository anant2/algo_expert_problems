package linkedlist.singly;

public class MergeSinglyLinkedList {

    public Node mergeSort(Node head) {

        if(head == null || head.next == null) return head;

        Node mid = findMidNode(head);

        Node left = mergeSort(head);
        Node right = mergeSort(mid);

        return mergeTwoList(left, right);
    }

    private Node findMidNode(Node head) {
        Node midPrev = null;
        while(head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        Node mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    public Node findMidNode2(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node mergeList(Node left, Node right) {
        Node newList = new Node();
        Node tail = newList;
        while(left != null && right != null) {
            if(left.data < right.data) {
                tail.next = left;
                left = left.next;
                tail = tail.next;
            } else {
                tail.next = right;
                right = right.next;
                tail = tail.next;
            }
        }
        tail.next = left != null ? left : right ;
        return newList.next;
    }

    public Node mergeTwoList(Node head1, Node head2) {

        SinglyLinkedList newList = new SinglyLinkedList();
        Node f = head1;
        Node s = head2;

        while (f != null && s != null) {
            if (f.data < s.data) {
                newList.insertLast(f.data);
                f = f.next;
            } else {
                newList.insertLast(s.data);
                s = s.next;
            }
        }

        while (f != null) {
            newList.insertLast(f.data);
            f = f.next;
        }

        while (s != null) {
            newList.insertLast(s.data);
            s = s.next;
        }
        return newList.head;
    }



}
