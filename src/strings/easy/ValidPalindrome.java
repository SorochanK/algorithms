package strings.easy;


public class ValidPalindrome {

    //https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/
//Valid Palindrome
//    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
    public static void main(String[] args) {
        var s = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(s);
        System.out.println(result);
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
