package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MissingNumbers {

    public static void main(String[] args) {
        int [] arr = {2,8,1,3,7,6}; //{1,2,3,4,7,8}
        System.out.println(missingNumbers(arr));
    }

    private static ArrayList<Integer> missingNumbers(int[] arr) {

        ArrayList<Integer> al = new ArrayList<>();
        int i = 0;
        while(i < arr.length) {
            int currentIndex = arr[i];
            if(currentIndex < arr.length && (currentIndex - 1 != i)) {
                swap(arr, currentIndex, i);
            }else{
                i++;
            }
        }

        for(int j = 0; j < arr.length; j++) {
            if(j+1 != arr[j]) {
                al.add(j+1);

            }
        }

        return al;

    }

    private static void swap(int[] arr, int currentIndex, int i) {
        int temp = currentIndex;
        arr[i] = arr[currentIndex - 1];
        arr[currentIndex - 1] = temp;

    }

}
