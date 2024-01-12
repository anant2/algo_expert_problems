package miscellaneous.binarysearch;

public class BinarySearch {


    public static void main(String[] args) {
        int [] arr  = {-12, -6, -2, 0 , 1, 4, 6, 9, 19, 22, 56, 99, 123};
        int [] arr2  = {101, 99, 80, 60 , 34, 21, 6, 0, -19, -22, -56, -99, -123};
        int target = -3;
        int result = search(arr2, target);
        System.out.println(result);
    }


    static int search(int [] arr, int target) {
        int start = 0;
        int end = arr.length;
        boolean isAsc = arr[start] < arr[end - 1];

        while (start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] == target) {
                return mid;
            }
            if(isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }


        }

        return -1;
    }

}
