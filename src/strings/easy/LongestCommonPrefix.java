package strings.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/887/
//Longest Common Prefix
//    Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".

    public static void main(String[] args) {
        var list = new String[]{"flower", "flow", "flight"};
        String prefix = longestCommonPrefix(list);
        System.out.println(prefix);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (String str : strs) {
            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }


    public static String longestCommonPrefixMy(String[] strs) {
        if (Arrays.asList(strs).contains("")) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder prefix = new StringBuilder();
        while (true) {
            Character initialLetter = null;
            Character letter;
            for (int i = 0; i < strs.length; i++) {
                String element = strs[i];
                if (element.length() - 1 < prefix.length()) {
                    return prefix.toString();
                }
                if (initialLetter == null) {
                    initialLetter = element.charAt(prefix.length());
                    continue;
                }
                letter = element.charAt(prefix.length());
                if (initialLetter != letter) {
                    return prefix.toString();
                }

                if (i == strs.length - 1) {
                    prefix.append(letter);
                }
            }
        }
    }
}
