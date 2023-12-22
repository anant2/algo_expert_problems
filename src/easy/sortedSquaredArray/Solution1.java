package easy.sortedSquaredArray;

public class Solution1 {

    public static void main(String[] args) {
        int arr [] = new int []{-7, -5, -4, 3, 6, 8, 9};
        int[] result = new int [arr.length];
        int start = 0;
        int end = arr.length - 1;
        int index = end;

        while(start <= end) {
            if (Math.abs(arr[start]) > Math.abs(arr[end])) {
                result[index--] = (int) Math.pow(arr[start],2);
                start++;
            } else {
                result[index--] = (int) Math.pow(arr[end],2);
                end--;
            }
        }
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}
