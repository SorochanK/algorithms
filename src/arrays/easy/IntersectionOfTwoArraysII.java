package arrays.easy;

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfTwoArraysII {


//    https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
//    Intersection of Two Arrays II
//    Given two integer arrays nums1 and nums2, return an array of their intersection.
//    Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};
        int[] result = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashSet<Integer> container = new HashSet<>();
        Arrays.stream(nums1).forEach(container::add);
        return Arrays.stream(nums2)
                .filter(container::contains)
                .toArray();
    }

    public static int[] intersectNotMy(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            int freq = map.getOrDefault(i, 0);
            map.put(i, freq + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if (map.get(i) != null && map.get(i) > 0) {
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
