package queue;

public class DynamicQueue extends CircularQueue{

    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int data) {
        if(isFull()) {
            int [] temp = new int[queue.length * 2];
            for(int i = 0 ; i < queue.length; i++) {
        temp[i] = queue[(i + front) % queue.length];
            }
            front = 0;
            end = queue.length;
            queue = temp;
        }
        return super.insert(data);
    }

}
