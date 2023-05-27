package arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Move Zeroes
public class MoveZeros {

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroesFirstApproach(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroesFirstApproach(int[] nums) {
        List<Integer> nonZeroList = Arrays.asList(Arrays.stream(nums)
                .filter(num -> num != 0)
                .boxed()
                .toArray(Integer[]::new));

        for (int i = 0; i < nonZeroList.size(); i++) {
            nums[i] = nonZeroList.get(i);
        }

        for (int i = nonZeroList.size(); i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroesAlternativeApproach(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
