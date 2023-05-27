package strings.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class ValidAnagram {


    //    https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
//    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
    public static void main(String[] args) {
        var s = "anagram";
        var t = "nagaram";
        boolean result = isAnagram(s, t);
        System.out.println(result);
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<String, Integer> map = new HashMap<>();

        Arrays.stream(s.split(""))
                .forEach(letter -> map.put(letter, map.getOrDefault(letter, 0) + 1));

        for (String letter : t.split("")) {
            if (!map.containsKey(letter)) {
                return false;
            }
            map.put(letter, map.get(letter) - 1);
        }

        return map.values().stream().noneMatch(val -> val != 0);
    }
}
