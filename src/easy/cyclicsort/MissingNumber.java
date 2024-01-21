package easy.cyclicsort;

public class MissingNumber {

    public static void main(String[] args) {
        int [] arr = {0,1,5,2,3,6,7,4,9}; //answer should be 8

        System.out.println(findMissingNumber(arr));

    }

    private static int findMissingNumber(int[] arr) {
        int index = 0;

        while(index < arr.length) {
            if(arr[index] < arr.length  && index != arr[index] ) {
                swap(arr, arr[index] , index);
            } else {
                index++;
            }
        }


        for(int j = 0 ; j < arr.length; j++) {
            if(j != arr[j]) {
                return j;
            }
        }
        return 0;
    }

    private static void swap(int[] arr, int indexTo, int indexFrom) {
        int temp = arr[indexTo];
        arr[indexTo] = indexTo; // put the value to the index
        arr[indexFrom] = temp;
    }

}
