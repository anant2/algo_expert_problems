package linkedlist;
//https://leetcode.com/problems/happy-number/
public class HappyNumber {

    public static void main(String[] args) {

        System.out.println(isHappy(19));
        //System.out.println(getSquare(100));
    }

    private static boolean isHappy(int n) {

        int fast = n ;
        int slow = n ;

        do {
            fast = getSquare(getSquare(fast));
            slow = getSquare(slow);
        } while(fast != slow);

        if(fast == 1) return true;

        return false;
    }

    private static int getSquare(int n) {
        int newNumber = 0;

        while ( n > 0) {
            int rem = n % 10;
            newNumber += rem * rem;
            n = n / 10;
        }
        return newNumber;
    }

}
