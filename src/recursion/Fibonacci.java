package recursion;

public class Fibonacci {

    public static void main(String[] args) {
        //int ans = fibo(6);
        //System.out.println(ans);
        for (int i = 0 ; i < 6; i++) {
            System.out.print(fibo(i)+ " ");
        }
    }

    private static int fibo(int n) {
        if(n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

}
