package recursion;

public class ReverseNumber {
    static int sum = 0;
    public static void main(String[] args) {
//        reverse1(1234);
//    System.out.println(sum);
        int result = reverse2(1234);
        System.out.println(result);
        //System.out.println(findPalindrome(1231));
    }

    private static boolean findPalindrome(int n) {
        return (n == reverse2(n)) ;
    }

    private static int reverse2(int i) {

        int digits  = String.valueOf(i).length();
        return helper(i , digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n) return n;

        return (int) ( (n % 10) * Math.pow(10,digits - 1) )+ helper(n/10,digits - 1);

    }

    public static void reverse1(int n) {
        if (n == 0) return;
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse1(n/10);
    }

}
