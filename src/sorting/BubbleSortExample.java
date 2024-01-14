package sorting;

import java.util.Arrays;

public class BubbleSortExample {

    public static void main(String[] args) {
        //int [] arr = {5,4,3,2,1};
        //int [] arr = {1,2,3,4,5};
        int [] arr = {-25,4,-13,22,-1,0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1 ; j < arr.length - i; j++) {
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) break;
        }

    }

}
