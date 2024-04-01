package trees.binarysearchtree;

public class BST {

    Node root;

    public BST(){}

    public boolean isEmpty() {
        return root == null;
    }

    public int getHeight(Node node) {
        if(node == null) return -1;
        return node.height;
    }

    public void display(){
        display(root, "Root Node:");
    }

    private void display(Node node, String details) {
        if(node == null) return;
        System.out.println(details + node.getValue());

        display(node.left, " Left Child of " + node.value+" ");

        display(node.right, " Right Child of " + node.value+" ");
    }

    public void insert(int data){
        root = insert(data , root);
    }

    public Node insert(int value, Node node) {
        if(node == null) {
            node = new Node(value);
            return node;
        }

        if(value < node.value) {
            node.left = insert(value , node.left);
        }

        if(value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(getHeight(node.left), getHeight(node.right) + 1);
        return node;
    }

    public boolean balanced(Node node) {
        if(node == null) return true;

        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void populate(int [] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

}
