package trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BinaryTreeExample tree = new BinaryTreeExample();
        tree.populate(sc);
        tree.display();
    }
}
