package linkedlist;

public class Main {

    public static void main(String[] args) {
        SinglyListExample ll = new SinglyListExample();
        ll.insertFirst(3);
        ll.insertFirst(2);
        //ll.insertFirst(8);
        ll.insertFirst(10);
        //ll.insertFirst(1);
        ll.insertLast(8);
        ll.insertLast(9);
        ll.display();
        ll.deleteIndex(3);
        //ll.deleteLast();
        //ll.deleteLast();
        //ll.deleteLast();
        //ll.deleteLast();
        //ll.deleteFirst();
        //ll.deleteFirst();
        //ll.deleteFirst();
        ll.display();
    }

}
