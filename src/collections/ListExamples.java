package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {


    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        List<String> list2 = new LinkedList<>();


        Integer [] i = list1.parallelStream().filter(a -> a%2 == 0).toArray(Integer[]::new);
        System.out.println(Arrays.toString(i));
        //Integer j = list1.concurrentStream().filter(a -> a%2 == 0).toArray(Integer[]:new);


    }

}
