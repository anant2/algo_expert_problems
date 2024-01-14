package classes;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.add("Anant");
        st.add("Santhi");
        st.add("Rabin");
        st.push("Dolker");

        System.out.println(st.empty());
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
    }

}
