package sorting;

import java.util.Arrays;

public class SelectionSortExample {

    public static void main(String[] args) {
        int [] arr = {5, 4, 3, 2, 1};
        //int [] arr = {1,2,3,4,5};
        //int [] arr = {-25,4,-13,22,-1,0};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void selectionSort(int[] arr) {

        for ( int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxElementIndex = findMax(arr,lastIndex);
            swap(arr,lastIndex,maxElementIndex);
        }

    }

    private static void swap(int[] arr, int lastIndex, int maxElementIndex) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxElementIndex];
        arr[maxElementIndex] = temp;
    }

    private static int findMax(int[] arr, int end) {
        int maxIndex = 0;
        for (int i = 1; i <= end; i++) {
            if(arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}
