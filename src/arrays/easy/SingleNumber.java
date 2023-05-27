package arrays.easy;

import java.util.Arrays;

public class SingleNumber {

    //    https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
    //     Single Number
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.

    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 2, 1, 2, 4, 3, 3, 5};
        int result = singleNumber(nums);
        System.out.println(result);
    }

    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            if (nums[i + 2] == nums[i]) {
                return nums[i + 1];
            }
            return nums[i];
        }
        return nums[nums.length - 1];
    }
}
