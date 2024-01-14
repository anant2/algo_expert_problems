package classes;

class MyThread extends Thread {

    int arr[] = {1,23,43,545,3};

    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("the value from  "+Thread.currentThread().getName() + " " + arr[i]);
        }
    }

}

public class ThreadExample {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
