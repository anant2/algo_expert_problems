package easy.cyclicsort;

// https://leetcode.com/problems/find-the-duplicate-number/
public class DuplicateNumber {

    public static void main(String[] args) {
        //int [] nums = {1,3,4,2,2};
        int[] nums = {3, 1, 3, 4, 2};

        System.out.println(findDuplicate(nums));

    }


    private static int findDuplicate(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            if (nums[start] != start + 1) {
                int correctIndex = nums[start] - 1;
                if (nums[correctIndex] != nums[start]) {
                    swap(nums, correctIndex, start);
                } else {
                    return nums[correctIndex];
                }
            } else {
                start++;
            }
        }
        return -1;
    }

    private static void swap(int[] nums, int correctIndex, int indexToBeSwapped) {
        int temp = nums[correctIndex];
        nums[correctIndex] = nums[indexToBeSwapped];
        nums[indexToBeSwapped] = temp;
    }

}
