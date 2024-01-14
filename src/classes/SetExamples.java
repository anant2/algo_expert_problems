package classes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExamples {

    public static void main(String[] args) {
        TreeSet<String> hs = new TreeSet<>();
        hs.add("Anant");
        hs.add("Dolker");
        hs.add("Sruthi");
        hs.add("Rabin");

        System.out.println(hs);

        hs.forEach(System.out::println);
    }

}
