package classes;

public class ArraysExamples {

    public static void main(String[] args) {
        int arr [] = {1,4,1,2,5,1,6,8,2,9,2,3,-23};
        int target = 0;
        int result = countOccurances(arr, target);
        int largestNumber = largestNumber(arr);
        int smallestNumber = smallestNumber(arr);
        System.out.println(smallestNumber);
    }

    private static int smallestNumber(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i< arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private static int largestNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i< arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int countOccurances(int [] arr, int target) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(target == arr[i]) {
                count++;
            }
        }
        return count;
    }


}
