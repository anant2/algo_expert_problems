package stack.dynamicstack;

import stack.customstack.CustomStack;

public class DynamicStack extends CustomStack {

    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    protected boolean push(int data) {
        if(isFull()) {
            int [] temp = new int[stack.length * 2];
            for(int i = 0 ; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
        }
        return super.push(data);
    }
}
