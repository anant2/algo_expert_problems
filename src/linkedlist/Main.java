package linkedlist;

public class Main {

    public static void main(String[] args) {
        //SinglyListExample ll = new SinglyListExample(2);
        //ll.display();
        //ll.insertFirst(3);
        //ll.display();
        //ll.insertFirst(2);
        //ll.insertFirst(8);
        //ll.insertFirst(10);
        //ll.insertFirst(1);
        //ll.insertLast(8);
        //ll.insertLast(9);
        //ll.display();
        //ll.insertAtIndex(7, 2);
        //ll.insertAtIndex(13, 0);
        //ll.insertAtIndex(15, 4);
        //ll.display();
        //ll.deleteIndex(3);
        //ll.deleteLast();
        //ll.deleteLast();
        //ll.deleteLast();
        //ll.deleteLast();
        //ll.deleteFirst();
        //ll.deleteFirst();
        //ll.deleteFirst();
        //ll.display();

//        DoublyLinkedList dl = new DoublyLinkedList();
//        dl.addFirst(12);
//        dl.addFirst(13);
//        dl.addLast(10);
//        dl.addLast(20);
//        dl.addAfter(10,15);
//        dl.display();

//        CircularLinkedList cl = new CircularLinkedList();
//        cl.insertFirst(3);
//        cl.insertFirst(6);
//        cl.insertFirst(5);
//        cl.insertFirst(10);
//        cl.display();
//        System.out.println(cl.getSize());
//        cl.deleteAtIndex(0);
//        cl.display();
//        System.out.println(cl.getSize());
//        cl.deleteAtIndex(2);
//        cl.display();

//        SinglyListExample ll = new SinglyListExample();
//        ll.insertLast(1);
//        ll.insertLast(2);
//        ll.insertLast(3);
//        ll.insertLast(4);
//        ll.insertLast(5);
//        ll.insertLast(6);
//        ll.insertLast(7);
//        ll.insertLast(8);
//        ll.display();


        SinglyListExample.Node node1 = new SinglyListExample.Node(1);
        SinglyListExample.Node node2 = new SinglyListExample.Node(2);
        SinglyListExample.Node node3 = new SinglyListExample.Node(3);
        SinglyListExample.Node node4 = new SinglyListExample.Node(4);
        SinglyListExample.Node node5 = new SinglyListExample.Node(5);
        SinglyListExample.Node node6 = new SinglyListExample.Node(6);
        SinglyListExample.Node node7 = new SinglyListExample.Node(7);
        SinglyListExample.Node node8 = new SinglyListExample.Node(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node3;

        SinglyListExample list = new SinglyListExample();
        //System.out.println(list.findLoop(node1));
        //System.out.println(list.lengthOfTheLoop(node1));
        //System.out.println(list.startOfCycle(node1).data);

        SinglyListExample list1 = new SinglyListExample();
        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(5);

        SinglyListExample list2 = new SinglyListExample();
        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(4);
        list2.insertLast(8);

        SinglyListExample list3 = list1.mergeTwoList(list1, list2);
        list1.display();
        list2.display();
        list3.display();

        System.out.println(list3.findMidNode(list1).data);
        System.out.println(list3.findMidNode(list2).data);
        System.out.println(list3.findMidNode(list3).data);


    }

}
