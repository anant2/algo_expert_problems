package easy.cyclicsort;

import java.util.*;
import java.util.stream.Collectors;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class FindAllDuplicates {

    public static void main(String[] args) {
        //int [] nums = {4,3,2,7,8,2,3,1};
        int [] nums = {1,1};

        List<Integer> result = findAllDuplicates(nums);
        System.out.println(result);
    }

    private static List<Integer> findAllDuplicates(int[] nums) {
        HashSet<Integer> result = new HashSet<>();
        int startIndex = 0;
        int endIndex = nums.length - 1;
        while (startIndex <= endIndex) {
            if (startIndex != nums[startIndex] - 1) {
                int correctIndex = nums[startIndex];
                if(correctIndex != nums[correctIndex - 1]) {
                    swap(nums, correctIndex, startIndex);
                } else {
                    result.add(nums[startIndex]);
                    startIndex++;
                }

            } else {
                startIndex++;
            }
        }

        return result.stream().collect(Collectors.toList());

    }

    private static void swap(int[] nums, int correctIndex, int actualIndex) {

        int temp = correctIndex;
        nums[actualIndex] = nums[correctIndex - 1];
        nums[correctIndex - 1] = temp;

    }

}
