package recursion;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        selectionSort(arr, arr.length , 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr, int end, int start, int max) {

        if (end == 0) return;

        if (start < end) {
            if (arr[start] > arr[max]) {
                selectionSort(arr, end, start + 1, start);
            } else {
                selectionSort(arr, end, start + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[end - 1];
            arr[end - 1] = temp;
            selectionSort(arr, end - 1, 0, 0);
        }
    }

}
