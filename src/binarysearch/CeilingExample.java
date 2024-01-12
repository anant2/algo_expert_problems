package binarysearch;

/*Find a number in the array which is equal to or the least among the greater numbers than the array
 * {2,4,6,7,9,10} suppose target element to be found is 5 . The answer would be 6 here.
*/
public class CeilingExample {

    public static void main(String[] args) {
        int arr [] = {2,5,7,9,14,17,25,29,40};
        //int target = 15; //answer should be 17.
        //int target = 30; //answer should be 40.
        //int target = -1; //answer should be 2.
        //int target = 14; //answer should be 14
        int target = 20; //answer should be 25
        int result = findCeiling(arr, target);
        System.out.println("The number close to the target element lies in index : "+result);
        System.out.println("The number close to the target element is : "+arr[result]);
    }

    private static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2 ;

            if( target == arr[mid]) return mid;

            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return start;

    }

}
