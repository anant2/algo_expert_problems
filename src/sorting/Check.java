package sorting;

import java.util.Arrays;

public class Check {

    public static void main(String[] args) {
        int[] arr = {-25, 4, -13, 22, -1, 0};
        int start = 0;
        int end = arr.length - 1;
        mergeSort(arr, start, end);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr, int start, int end) {

        if (end == 0) return;

        if (start < end) {
            if (arr[start] > arr[start + 1]) {
                int temp = arr[start];
                arr[start] = arr[start + 1];
                arr[start + 1] = temp;
            }
            mergeSort(arr, start + 1 , end);
        } else {
            mergeSort(arr, 0 , end - 1);
        }


    }


}
