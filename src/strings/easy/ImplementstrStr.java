package strings.easy;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImplementstrStr {

//    https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/
//    Implement strStr()
//    Given two strings needle and haystack,
//    return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.


    public static void main(String[] args) {
        var haystack = "mississippi";
        var needle = "issip";
        int result = strStr(haystack, needle);
        System.out.println(result);
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        Stream.of("").map(s-> s+ "1").collect(Collectors.toList());
        if (needle.equals(haystack)) {
            return 0;
        }
        // length of the needle
        int needleLength = needle.length();
        // Loop through the haystack and slide the window
        for (int i = 0; i < haystack.length() - needleLength + 1; i++) {
            // Check if the substring equals to the needle
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
