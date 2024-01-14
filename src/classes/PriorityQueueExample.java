package classes;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    static class CustomIntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 < o2 ? 1 : -1;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> testIntegersPQ = new PriorityQueue<>(new CustomIntegerComparator());
        testIntegersPQ.add(11);
        testIntegersPQ.add(5);
        testIntegersPQ.add(-1);
        testIntegersPQ.add(12);
        testIntegersPQ.add(6);

        PriorityQueue<Integer> integers = new PriorityQueue<>();
        integers.add(11);
        integers.add(5);
        integers.add(-1);
        integers.add(12);
        integers.add(6);

        System.out.println(testIntegersPQ);

        System.out.println(integers);
    }


}
