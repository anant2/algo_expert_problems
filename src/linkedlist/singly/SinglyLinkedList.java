package linkedlist.singly;


public class SinglyLinkedList {



    Node head;
    Node tail;
    int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    public SinglyLinkedList(int data) {
        Node node = new Node(data);
        node.next = null;

        if (head == null) {
            head = node;
            tail = head;
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

    //insert using recusion

    public void insertAtIndex(int data, int index) {
        head = insertRec(data, index, head);
    }

    private Node insertRec(int data, int index, Node node) {
        if (index == 0) {
            Node newNode = new Node(data);
            newNode.next = node;
            size++;
            return newNode;
        }
        node.next = insertRec(data, --index, node.next);
        return node;
    }

    public void deleteFirst() {

        if (head == null) {
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
        if (tail == null) System.out.println("The list is empty. Cannot delete");
        else {

            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node temp = head;
                for (int i = 0; i < this.size - 2; i++) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
            this.size--;
        }
    }

    public void deleteIndex(int index) {
        if (index == 0) {
            this.deleteFirst();
        } else if (index == this.size - 1) {
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

    public Node getIndexValue(int index) {
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public void removeDuplicates() {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
                size--;
            } else {
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;

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

    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public boolean findLoop(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public boolean findLoop2(Node head) {
        Node temp = head.next;

        while (head != null && head.next != null) {
            temp = temp.next;
            if (head == temp) {
                return true;
            }
        }
        return false;
    }

    public int lengthOfTheLoop(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                int length = 0;
                do {
                    slow = slow.next;
                    length++;
                } while (slow != fast);
                return length;
            }
        }
        return 0;
    }

    public Node startOfCycle(Node head) {

        if (head == null || head.next == null) return head;
        int lengthOfCycle = lengthOfTheLoop(head);
        Node s = head;
        Node t = head;
        while (lengthOfCycle > 0) {
            s = s.next;
            lengthOfCycle--;
        }
        while (s != t) {
            s = s.next;
            t = t.next;
        }

        return s;
    }

    // merge two list
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

    public Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public void reverseList(Node node){

        if(node == tail) {
            head = tail;
            return;
        }

        reverseList(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;

    }

    public void reverseList2(Node node){
        Node prev = null;
        Node current = head;
        Node next = current.next;
        while(current != null) {
            current.next = prev;
            prev = current;
            current = next;
            if(next != null) next = next.next;
        }
        head = prev;
    }

    public Node reverseII(Node head, int left, int right) {

        if(left == right) return head;

        Node current = head;
        Node previous = null;

        for( int i = 0; current != null && i < left - 1; i++) {
            previous = current;
            current = current.next;
        }

        Node lastNode = previous;
        Node newEnd  = current;

        Node next = current.next;
        for(int i = 0; current != null && i < right - left + 1; i++) {
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
