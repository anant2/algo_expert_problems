package linkedlist;

public class CircularLinkedList {

    Node head;
    Node tail;

    int size;

    public CircularLinkedList() {
        head = null;
        tail = null;
    }

    public int getSize() {
        return size;
    }

    public void insertFirst(int data){
        Node node = new Node(data);
        if(head == null) {
            head = node;
            tail = node;
            tail.next = head;
        } else {
            node.next = head;
            head = node;
            tail.next = head;
        }
        this.size++;
    }

    public void deleteAtIndex(int index) {
        Node node = findIndex(index);
        if(node == null) return;
        if(node == tail) {
            tail.next = head.next;
            head = head.next;
        } else {
            node.next = node.next.next;
        }
        size--;
    }

    public Node findIndex(int index) {
        Node temp = head;
        if(index == 0) return tail;
        for(int i = 1; i < index ; i++) {
            temp = temp.next;
        }
        return temp;
    }


    public  void display(){
        Node temp = head;
         do {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }while(temp != head);
        System.out.print(" HEAD");
        System.out.println();
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

}
