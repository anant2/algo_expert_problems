package queue;

public class CircularQueue {

  public int[] queue;
  private static final int INITIAL_SIZE = 10;

  int front = 0;
  int end = 0;

  int size = 0;

  public CircularQueue() {
    this(INITIAL_SIZE);
  }

  public CircularQueue(int size) {
    this.queue = new int[size];
  }

  protected boolean isFull() {
    return size == this.queue.length;
  }

  protected boolean isEmpty() {
    return size == 0;
  }

  public boolean insert(int data) {
    if (isFull()) {
      System.out.println("queue is full");
      return false;
    }
    queue[end++] = data;
    end = end % queue.length;
    size++;
    return true;
  }

  public int remove() throws Exception {
    if (isEmpty()) {
      throw new Exception("Queue is empty");
    }
    int removed = queue[front++];
    front = front % queue.length;
    size--;
    return removed;
  }

  public int first() throws Exception {
    if (isEmpty()) {
      throw new Exception("Queue is empty");
    }
    return queue[front];
  }

  public void display() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
    }
    int i = front;
    do {
      System.out.print(queue[i++] + " <- ");
      i  %= queue.length;
    } while (i != end);
    System.out.print("End");
    System.out.println();
  }
}
