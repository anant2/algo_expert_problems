package recursion;

public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 9, 10, 1, 2, 3, 5};
        int target = 6;
        System.out.println(binarySearch(arr, 0, arr.length - 1, target));
    }

    private static int binarySearch(int[] arr, int start, int end, int target) {

        if(start > end) return -1;

            int mid = end + (start - end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target <= arr[mid]) {
                if (target >= arr[start] && target <= arr[mid]) {
                    return binarySearch(arr, start, mid - 1, target);
                } else {
                    return binarySearch(arr, mid + 1, end, target);
                }
            }
            if (target >= arr[mid] && target <= arr[end]) {
                return binarySearch(arr, mid + 1, end, target);
            }
                return binarySearch(arr, start, mid - 1, target);


        }


}
