package trees;

import java.util.Scanner;

public class BinaryTreeExample {

  Node root;
  public void populate(Scanner sc) {
    System.out.println("Enter the root of the tree: ");
    int data = sc.nextInt();
    root = new Node(data);
    buildTree(sc, root);
  }

  private void buildTree(Scanner sc, Node node) {
    System.out.println("Do you want to enter a value to the left: ");
    boolean left = sc.nextBoolean();
    if (left) {
      System.out.println("Enter value for left of node: " + node.data);
      int data = sc.nextInt();
      Node leftNode = new Node(data);
      node.left = leftNode;
      buildTree(sc, leftNode);
    }

    System.out.println("Do you want to enter a value to the right: ");
    boolean right = sc.nextBoolean();
    if (right) {
      System.out.println("Enter value for right of node: " + node.data);
      int data = sc.nextInt();
      Node rightNode = new Node(data);
      node.right = rightNode;
      buildTree(sc, rightNode);
    }
  }

  public void display() {
      prettyDisplay(this.root, 0);
  }

  private void prettyDisplay(Node node, int level) {
    if(node == null) {
      return;
    }

    prettyDisplay(node.right, level + 1);

    if(level != 0) {
      for(int i = 0 ; i < level - 1; i++) {
        System.out.print("|\t\t");
      }
      System.out.println("|-------->" + node.data);
    } else {
      System.out.println(node.data);
    }

    prettyDisplay(node.left, level + 1);

  }
}
