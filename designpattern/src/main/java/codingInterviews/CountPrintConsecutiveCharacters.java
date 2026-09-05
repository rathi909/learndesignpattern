package codingInterviews;

import java.util.stream.IntStream;

public class CountPrintConsecutiveCharacters {
    public static void main(String[] args) {

        String str = "aabbbcadddb";

        int[] count = {1};

        IntStream.range(1, str.length() + 1)
                 .forEach(i -> {
                     if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                         count[0]++;
                     } else {
                         System.out.println(str.charAt(i - 1) + " = " + count[0]);
                         count[0] = 1;
                     }
                 });
    }
}
