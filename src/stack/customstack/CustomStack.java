package stack.customstack;

public class CustomStack {

    protected int [] stack;
    private final static int INITIAL_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(INITIAL_SIZE);
    }

    public CustomStack(int size) {
        this.stack = new int[size];
    }

    protected boolean push(int data) {
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        stack[++ptr] = data;
        return true;
    }

    protected int pop() throws StackCustomException {
        if(isEmpty()) {
            throw new StackCustomException("Stack is empty");
        }
        return stack[ptr--];
    }

    protected boolean isFull() {
        return ptr == this.stack.length - 1;
    }

    protected boolean isEmpty() {
        return ptr == -1;
    }

    protected int peek() {
        return stack[ptr];
    }



}
