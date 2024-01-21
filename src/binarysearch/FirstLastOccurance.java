package binarysearch;

import java.util.Arrays;

public class FirstLastOccurance {

    public static void main(String[] args) {
        int [] nums =  {5,7,7,8,8,10};
        //int target = 8; //[3,4]
        int target = 6; // [-1,-1]
        int [] result = {-1,-1};

        int firstOccurance = findOccurance( nums,  target,  true) ;
        int lastOccurance = findOccurance( nums,  target,  false) ;
        result[0] = firstOccurance;
        result[1] = lastOccurance;

        System.out.println(Arrays.toString(result));


    }

    private static int findOccurance(int[] nums, int target, boolean isFirstOccurance) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = end + (start - end)/2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (isFirstOccurance) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return ans;
    }



}
