package classes;

import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Anant");
        al.add("Rabin");
        al.add("Santhi");
        al.add("Dolker");

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Anant");

        ll.add("Rabin");
        ll.add("Santhi");
        ll.add("Dolker");
        ll.add("Anant");
        ll.addFirst("Anjana");
        ll.addLast("Prem");

        //System.out.println(al);
        //System.out.println(ll);
        //ll.removeFirstOccurrence("Anant");
        ll.removeLastOccurrence("Anant");
        //ll.remove();
        //System.out.println(ll.remove());
        //System.out.println(ll.removeFirst());
        //System.out.println(ll);

//        Iterator<String> itr = ll.iterator();
//        while(itr.hasNext()) {
//            System.out.println(itr.next());
//        }

        ListIterator<String> itr2 = ll.listIterator();
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }
        System.out.println("-----------------");
        while(itr2.hasPrevious()){
            System.out.println(itr2.previous());
        }
    }

}
