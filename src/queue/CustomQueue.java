package queue;

public class CustomQueue {

  public int[] queue;
  private static final int INITIAL_SIZE = 10;

  int end = 0;

  public CustomQueue() {
    this(INITIAL_SIZE);
  }

  public CustomQueue(int size) {
    this.queue = new int[size];
  }

  protected boolean isFull() {
    return end == this.queue.length;
  }

  protected boolean isEmpty() {
    return end == 0;
  }

  public boolean insert(int data) {
    if (isFull()) {
      System.out.println("queue is full");
      return false;
    }
    queue[end++] = data;
    return true;
  }

  public int remove() throws Exception{
    if(isEmpty()) {
      throw new Exception("Queue is empty");
    }
    int removed = queue[0];


    for(int i = 1; i < end; i++) {
      queue[i-1] = queue[i];
    }
    end--;
    return removed;
  }

  public void display(){
    for(int i = 0; i < end;i++) {
      System.out.println(queue[i]+" ");
    }
    System.out.println("End");
  }

  public int first() throws Exception {
    if(isEmpty()) {
      throw new Exception("Queue is empty");
    }
    return queue[0];
  }

}


