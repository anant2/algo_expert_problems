package linkedlist.singly;

public class Main {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node3;

        SinglyLinkedList list = new SinglyLinkedList();
        //System.out.println(list.findLoop(node1));
        //System.out.println(list.findLoop2(node1));
        //System.out.println(list.lengthOfTheLoop(node1));
        //System.out.println(list.startOfCycle(node1).data);

        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(5);

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.insertLast(1);
        list2.insertLast(3);
        list2.insertLast(7);
        list2.insertLast(8);

//        Node list3 = list1.mergeTwoList(list1.head, list2.head);
//        list1.display();
//        list2.display();
//        list2.display(list3);
//
//        System.out.println(list1.findMidNode(list2.head).data);
//        System.out.println(list1.findMidNode(list3).data);


        SinglyLinkedList list3 = new SinglyLinkedList();
        list3.insertLast(1);
        list3.insertLast(2);
        list3.insertLast(3);
        list3.insertLast(4);
        list3.insertLast(5);
        //list3.display();
//        MergeSinglyLinkedList merge = new MergeSinglyLinkedList();
//        Node result = merge.mergeSort(list3.head);
//        list3.display(result);
        BubbleSort st = new BubbleSort();
        Node node = st.getIndexValue(list3, 3);
        //System.out.println(node.data);
        //System.out.println(list3.size);

        //st.bubbleLinkedList(list3);
        list3.display();
        ReorderList reorderList = new ReorderList();
        Node newHead = reorderList.reorder(list3.head);
        list3.display(newHead);
//        Palindrome isPalindrome = new Palindrome();
//        System.out.println(isPalindrome.isPalindrome(list3.head));
//        list3.display(list3.head);
//        list3.display();
//        list3.reverseList(list3.head);
//        list3.display();
//        list3.reverseList2(list3.head);
//        list3.display();
//        ReverseList lt = new ReverseList();
//        Node newList = lt.reverseSection(list3.head, 4,6);
//        list3.display(newList);


    }

}
