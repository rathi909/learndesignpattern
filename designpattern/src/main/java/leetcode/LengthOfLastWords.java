package leetcode;

class Solution {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World  kjklskllasllas;;la;llallallsda"));
    }
    public static int lengthOfLastWord(String s) {


        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && len == 0) {
                continue;
            } else if (s.charAt(i) == ' ' && len > 0) {
                break;
            } else {
                len++;
            }
        }
        return len;
    }
}