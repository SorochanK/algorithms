package arrays.easy;

import java.util.HashSet;

public class ContainsDuplicate {
    //    https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
//    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> duplicateContainer = new HashSet<>();

        for (int num : nums) {
            if (duplicateContainer.contains(num)) {
                return true;
            }
            duplicateContainer.add(num);
        }
        return false;
    }
}
