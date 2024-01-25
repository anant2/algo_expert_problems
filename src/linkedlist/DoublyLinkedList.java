package linkedlist;

public class DoublyLinkedList {

    Node head;
    Node tail;

    int size;

    public DoublyLinkedList() {
        this.size = 0;
    }

    private class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void addFirst(int data) {
        Node node = new Node(data);

        if(head == null) {
            head = node;
            tail = head;
        } else {
            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;
        }
        this.size++;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        if(tail == null) {
            tail = node;
            head = tail;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        this.size++;
    }

    public void addAfter(int after, int data) {
        Node node = new Node(data);
        Node nodeAfter = findNode(after);

        if(nodeAfter == null) {
            System.out.println("No node found");
            return;
        }

        node.next = nodeAfter.next;
        node.prev = nodeAfter;
        if(nodeAfter.next != null) {
            nodeAfter.next.prev = node;
        }
        nodeAfter.next = node;
    }

    public Node findNode(int value) {
        Node ptr = head;
        while(ptr.next != null) {
            if(ptr.data == value) {
                return ptr;
            }
            ptr =ptr.next;
        }

        return null;
    }

    public void display(){
        Node temp = head;
        Node last = tail;
        while(temp != null) {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.print("END");

        System.out.println();
        System.out.println("-----------");

        while(last!=null) {
            System.out.print(last.data+" -> ");
            last = last.prev;
        }
        System.out.print("START");
    }

}
