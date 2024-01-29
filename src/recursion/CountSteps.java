package recursion;

public class CountSteps {

    public static void main(String[] args) {
       int result = countSteps(41);
        System.out.println(result);
    }

    private static int countSteps(int i) {
        return helper(i , 0);
    }

    private static int helper(int num, int count) {

        if(num == 0) return count;

        if(num % 2 == 0) return helper(num/2,count+1);

        return helper(num - 1 , count + 1);

    }

}
