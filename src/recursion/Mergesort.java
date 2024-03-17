package recursion;

import java.util.Arrays;

public class Mergesort {

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        mergeSortInPlace(arr, 0 , arr.length );
        int [] result = mergeSort(arr);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSortInPlace(int[] arr, int start, int end) {
        int mid = end + (start - end) / 2;

        if(end - start == 1) return;

        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr,mid, end);

        mergeInPlace(arr,start,mid,end);

    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }

    private static int[] mergeSort(int[] arr) {

        int mid = arr.length/2;

        if(arr.length == 1) return arr;

        int [] left = mergeSort(Arrays.copyOfRange(arr, 0 , mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

         return merge(left, right);


    }

    private static int [] merge(int[] left, int[] right) {
        int a = 0 ;
        int b = 0;

        int result [] = new int[left.length + right.length];
        int c = 0;
        while(a < left.length && b < right.length) {

            if(left[a] < right[b]) {
                result[c] = left[a];
                a++;
                c++;
            } else {
                result[c] = right[b];
                b++;
                c++;
            }

        }

        while(a < left.length) {
            result[c] = left[a];
            a++;
            c++;
        }

        while(b < right.length) {
            result[c] = right[b];
            b++;
            c++;
        }

        return result;
    }

}
