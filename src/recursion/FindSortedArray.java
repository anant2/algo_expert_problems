package recursion;

public class FindSortedArray {

    public static void main(String[] args) {
        int [] arr = {1,3,7,8,10,15};
        System.out.println(isSorted(arr, 0));
    }

    private static boolean isSorted(int[] arr ,int index) {
        if(index == arr.length - 1) return true;

        return arr[index] < arr[index + 1] && isSorted(arr,index + 1);
    }


}
