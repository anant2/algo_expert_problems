package linkedlist.singly;

import java.util.Arrays;

public class BubbleSort {

    public void sortIt(int[] arr) {
        bubbleForArray(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    private void bubbleForArray(int[] arr, int end, int start) {
        if(end == 0) return;
        if(start < end) {
            if(arr[start] > arr[start + 1]) {
                int temp = arr[start + 1];
                arr[start + 1] = arr[start];
                arr[start] = temp;
            }
            bubbleForArray(arr , end , start + 1);
        } else {
            bubbleForArray(arr, end - 1, 0);
        }
    }

    public void bubbleLinkedList(SinglyLinkedList list) {

        bubbleSortLinkedList(list, list.size - 1, 0 );

    }

    private void bubbleSortLinkedList(SinglyLinkedList list, int r, int c) {

        if (r == 0 ) return;

        if(c < r) {
            Node first = getIndexValue(list , c);
            Node second = getIndexValue(list, c + 1);

            if(first.data > second.data) {
                if(first == list.head) {
                    first.next = second.next;
                    second.next = first;
                    list.head = second;
                } else if (second == list.tail) {
                    Node prev = getIndexValue(list, c - 1);
                    prev.next = second;
                    list.tail = first;
                    second.next = first;
                    first.next = null;
                } else {
                    Node prev = getIndexValue(list, c - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
                bubbleSortLinkedList(list, r , c + 1);
            }
        }
        else {
            bubbleSortLinkedList(list, r - 1, 0);
        }
    }

    public Node getIndexValue(SinglyLinkedList list, int index) {
        Node temp = list.head;
        if(index >= list.size) return null;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }


}
