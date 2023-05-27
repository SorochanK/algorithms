package strings.easy;


import java.util.*;

public class FirstUniqueCharacterInAString {


    //https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/
//    First Unique Character in a String
//    Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

    public static void main(String[] args) {
        var s = "loveleetcode";
        int result = firstUniqChar(s);
        System.out.println(result);
    }

    public static int firstUniqChar(String s) {
        Map<String, Integer> container = new LinkedHashMap<>();
        String[] letters = s.split("");
        for (String letter : letters) {
            if (container.containsKey(letter)) {
                container.put(letter, container.get(letter) + 1);
            } else {
                container.put(letter, 1);
            }
        }

        return container.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .map(s::indexOf)
                .orElse(-1);
    }
}
