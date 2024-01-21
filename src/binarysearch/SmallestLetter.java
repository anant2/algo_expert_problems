package binarysearch;

public class SmallestLetter {

    public static void main(String[] args) {
        //char [] letters = {'c','f','j'};
        //char target = 'd'; // answer is c

        //char [] letters = {'c','f','j'};
        //char target = 'c'; // answer is f

        char [] letters = {'x','x','y','y'};
        char target = 'z'; //answer is x

        System.out.println(findSmallest(letters,target));
    }

    private static char findSmallest(char[] arr,char target) {

        int start = 0;
        int end = arr.length - 1;

        while( start <= end) {
            int mid = end + (start-end)/2;
            if (target < arr[mid]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }

        return arr[start % arr.length];

    }

}
