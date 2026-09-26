
package codingInterviews;

public class LongestPalindrome {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            // Odd length
            String odd = expand(s, i, i);
            if (odd.length() > result.length()) {
                result = odd;
            }

            // Even length
            String even = expand(s, i, i + 1);
            if (even.length() > result.length()) {
                result = even;
            }
        }

        return result;
    }

    private static String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() &&
                s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public static void main(String[] args) {
        String s1 = "babad";
        String s2 = "cbbd";

        System.out.println("Input: " + s1);
        System.out.println("Longest Palindrome: " + longestPalindrome(s1));

        System.out.println();

        System.out.println("Input: " + s2);
        System.out.println("Longest Palindrome: " + longestPalindrome(s2));
    }
}