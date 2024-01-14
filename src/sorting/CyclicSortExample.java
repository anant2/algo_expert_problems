package sorting;

import java.util.Arrays;

public class CyclicSortExample {

    public static void main(String[] args) {
        //int [] arr = {5, 4, 3, 2, 1};
        //int [] arr = {1,2,3,4,5};
        int [] arr = {3, 1, 5, 2, 4};
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if (arr[i] != i + 1) {
                swap(arr, arr[i] - 1, i);
            } else {
                i++;
            }
        }

    }

    private static void swap(int[] arr, int toBePlacedIndex, int currentIndex) {
        int temp = arr[toBePlacedIndex];
        arr[toBePlacedIndex] = arr[currentIndex];
        arr[currentIndex] = temp;
    }

}
