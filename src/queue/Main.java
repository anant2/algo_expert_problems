package queue;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        //queue.insert(6);

//        queue.display();
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());


        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.insert(1);
        circularQueue.insert(2);
        circularQueue.insert(3);
        circularQueue.insert(4);
        circularQueue.insert(5);


        circularQueue.display();

        System.out.println(circularQueue.remove());
        circularQueue.display();
        circularQueue.insert(6);
        circularQueue.display();
//        System.out.println(circularQueue.remove());
//        System.out.println(circularQueue.remove());
//        System.out.println(circularQueue.remove());
//        System.out.println(circularQueue.remove());
//        System.out.println(circularQueue.remove());
  }
}
