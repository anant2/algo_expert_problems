package recursion;

public class SumOfDigits {

    public static void main(String[] args) {

        int result = sum(54321);
        System.out.println(result);

    }

    public static int sum(int n) {
        if(n == 0) return 0;

        return (n % 10) + sum(n/10);
    }

}
