package binarysearch;

public class SearchInfiniteArray {

    public static void main(String[] args) {
        //int [] arr = {1,2,3,4,5};
        //int [] arr = {1,2,3,4,5,6};
        int [] arr = {1,4,6,8,9,13,17,19,25,47,56,78,90,100};
        int target = 100;
        System.out.println(findAnswer(arr, target));
    }

    private static int findAnswer(int[] arr, int target) {

        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + 2 * (end - start + 1);
            start = newStart;
        }

        return binarySearch(arr, target ,start ,end);

    }

    private static int binarySearch(int[] arr, int target , int start, int end) {

        while(start <= end) {
            int mid = end + (start - end) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
