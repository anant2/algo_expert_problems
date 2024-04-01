package trees.binarysearchtree;

public class Node {

    int value;
    Node left;
    Node right;
    int height;

    public Node(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }

}
