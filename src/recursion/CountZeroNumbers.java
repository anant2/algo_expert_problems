package recursion;

import org.w3c.dom.ls.LSOutput;

public class CountZeroNumbers {



    public static void main(String[] args) {
        int result = count(100200045);
        System.out.println(result);
    }

    private static int count(int i) {
        return helper(i , 0);
    }

    private static int helper(int num, int count) {

        if(num == 0) return count;

        int rem = num % 10;
        if(rem == 0) return helper(num/10, count + 1);

        return helper(num/10, count);

    }

}
