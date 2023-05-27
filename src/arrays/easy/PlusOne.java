package arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {

//    https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
//    Plus One
//    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//    Increment the large integer by one and return the resulting array of digits.
    public static void main(String[] args) {
        int[] nums = new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 9};
        int[] result = plusOneRight(nums);
        System.out.println(Arrays.toString(result));
    }


    public static int[] plusOneRight(int[] digits) {
        if (digits.length == 1) {
            if (digits[0] < 9) {
                return new int[]{digits[0] + 1};
            } else {
                return new int[]{1, 0};
            }
        }

        for (int i = digits.length - 1; i >= 0; i--) {
            int incrementedValue = digits[i] + 1;
            if (incrementedValue != 10) {
                digits[i] = incrementedValue;
                break;
            }
            digits[i] = 0;

        }

        //Add leading ONE
        if (digits[0] == 0) {
            int[] newArray = new int[digits.length + 1];
            newArray[0] = 1;
            System.arraycopy(digits, 0, newArray, 1, digits.length);
            digits = newArray;
        }
        return digits;
    }

    public static int[] plusOneWrong(int[] digits) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(digits)
                .mapToObj(String::valueOf)
                .forEach(sb::append);
        String digitsString = sb.toString();
        return Arrays.stream(String.valueOf(Long.parseLong(digitsString) + 1).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
