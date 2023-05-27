package arrays.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoSum {
//    https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.

    public static void main(String[] args) {
        int[] nums = new int[]{2, 11, 15, 7};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> container = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (container.containsKey(target - nums[i])) {
                return new int[]{container.get(target - nums[i]), i};
            }
            container.put(nums[i], i);
        }
        return new int[]{0, 1};
    }
}
