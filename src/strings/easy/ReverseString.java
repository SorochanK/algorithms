package strings.easy;


import java.util.Arrays;

public class ReverseString {
    //https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/
//    Write a function that reverses a string. The input string is given as an array of characters s.
//
//You must do this by modifying the input array in-place with O(1) extra memory.
    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
    }
}
