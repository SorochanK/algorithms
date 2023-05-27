package strings.easy;

public class ReverseInteger {

    private static final String MINUS_SIGN = "-";

    //https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/
//    Reverse Integer
//    Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
    public static void main(String[] args) {
        int x = 1534236469;
        int result = reverse(x);
        System.out.println(result);
    }

    public static int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        boolean shouldApplyMinusSign = x < 0;
        x = Math.abs(x);

        String xString = new StringBuilder(String.valueOf(x))
                .reverse()
                .toString()
                .replaceAll("^0+", "");
        try {
            return shouldApplyMinusSign ? Integer.parseInt(MINUS_SIGN + xString) : Integer.parseInt(xString);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
