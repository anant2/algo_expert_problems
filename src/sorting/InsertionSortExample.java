package sorting;

import java.util.Arrays;

public class InsertionSortExample {

    public static void main(String[] args) {
        //int [] arr = {5, 4, 3, 2, 1};
        //int [] arr = {1,2,3,4,5};
        int [] arr = {-25,4,-13,22,-1,0};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1 ; j > 0 ; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j ,j - 1);
                }else {
                    break;
                }
            }
        }

    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;

    }

}
