package easy.cyclicsort;

import java.util.Arrays;

public class MissingPositive {

    public static void main(String[] args) {
        int[] nums = {2,1};
        int result = firstMissingPositive(nums);
        System.out.println(result);
    }

    private static int firstMissingPositive(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int correctIndex = nums[start] - 1;
            if(nums[start] > 0 && nums[start] <= nums.length && nums[start] != nums[correctIndex]){

                swapNumbers(nums, start, correctIndex);
            } else {
                start++;
            }
        }

        for(int i = 0 ; i < nums.length; i++) {
            if(i != nums[i] -1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    private static void swapNumbers(int[] nums, int start, int correctIndex) {
        int temp = nums[start];
        nums[start] = nums[correctIndex];
        nums[correctIndex] = temp;
    }

}
