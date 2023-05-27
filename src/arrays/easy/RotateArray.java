package arrays.easy;

import java.util.Arrays;

public class RotateArray {
    //https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
    //Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
    //[1,2,3,4,5,6,7]

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 4;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
