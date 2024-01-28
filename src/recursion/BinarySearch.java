package recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int [] arr  = {-12, -6, -2, 0 , 1, 4, 6, 9, 19, 22, 56, 99, 123};
        int target = -123;

        int result = findNumber(arr, target, 0, arr.length - 1) ;

        System.out.println(result);

    }

    private static int findNumber(int[] arr, int target, int start, int end) {

        if(start > end) return -1;

        int mid = end + (start - end) / 2;

        if(target == arr[mid]) return mid;

        if(target < arr[mid]) {
            return findNumber(arr, target, start, mid - 1);
        }
        return findNumber(arr, target, mid + 1, end);


    }

}
