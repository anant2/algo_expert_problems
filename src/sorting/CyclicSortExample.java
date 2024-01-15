package sorting;

import java.util.Arrays;

public class CyclicSortExample {

    public static void main(String[] args) {
        //int [] arr = {0, 4, 3, 2, 1};
        //int [] arr = {1,2,3,4,0};
        int [] arr = {3, 1, 0, 2, 4};
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {
        int index = 0;

        while(index < arr.length) {
            if(index != arr[index]) {
                swap(arr, arr[index], index);
            } else {
                index++;
            }
        }

    }

    private static void swap(int[] arr, int indexTo, int indexFrom) {
        int temp = arr[indexTo];
        arr[indexTo] = indexTo;
        arr[indexFrom] = temp;
    }


}
