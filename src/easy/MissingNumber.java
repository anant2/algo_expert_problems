package easy;

public class MissingNumber {

    public static void main(String[] args) {
        int [] arr = {0,2,1,4}; //answer should be 3

        System.out.println(findMissingNumber(arr));

    }

    private static int findMissingNumber(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int currentIndexValue = arr[i];
            if(currentIndexValue < arr.length && currentIndexValue != i) {
                swap(arr, currentIndexValue, i) ;
            } else {
                i++;
            }
        }

        for(int j = 0 ; j < arr.length; j++) {
            if(j != arr[j]) {
                return j;
            }
        }
        return arr.length;
    }

    private static void swap(int[] arr, int currentIndex, int i) {
        int temp = arr[currentIndex];
        arr[currentIndex] = arr[i];
        arr[i] = temp;
    }

}
