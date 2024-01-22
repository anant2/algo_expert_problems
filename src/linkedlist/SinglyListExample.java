package linkedlist;



public class SinglyListExample {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;
    int size;

    public SinglyListExample() {
        this.size = 0;
    }

    public SinglyListExample(int data) {
        Node node = new Node(data);
        node.next = null;

        if (head == null) {
            head = node;
            head = tail;
        }
        this.size++;
    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            node.next = head;
            head = node;
        }
        this.size++;
    }

    public void insertLast(int data) {
        if (tail == null) insertFirst(data);
        else {
            Node node = new Node(data);
            tail.next = node;
            tail = node;
            this.size++;
        }

    }

    public void deleteFirst() {

        if(head == null) {
            System.out.println("The list is empty. Cannot delete");
        } else {
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                Node temp = head.next;
                head = temp;
            }
            this.size--;
        }
    }

    public void deleteLast() {
        if(tail == null) System.out.println("The list is empty. Cannot delete");
        else {

            if(head == tail) {
                head = null;
                tail = null;
            } else {
                Node temp = head;
                for(int i = 0 ; i < this.size - 2; i++) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
            this.size--;
        }
    }

    public void deleteIndex(int index) {
        if(index == 0) {
            this.deleteFirst();
        }
        else if(index == this.size - 1) {
            this.deleteLast();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        this.size--;

    }

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }


}
