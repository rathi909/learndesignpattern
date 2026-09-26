package codingInterviews;

public class Solution {
   public static int countRecursion(String S) {
       final int MOD = 1_000_000_007;
       String target = "recursion";
       int n = target.length(); // 9
       // dp[j] = number of ways to match the first j characters of "recursion"
       // using the characters of S scanned so far
       long[] dp = new long[n + 1];
       dp[0] = 1; // exactly one way to match "nothing"
       for (int i = 0; i < S.length(); i++) {
           char ch = S.charAt(i);
           // go from right (high j) to left (low j)
           // so we don't reuse this same character of S twice in one step
           for (int j = n - 1; j >= 0; j--) {
               if (target.charAt(j) == ch) {
                   dp[j + 1] = (dp[j + 1] + dp[j]) % MOD;
               }
           }
       }
       return (int) dp[n]; // dp[9] = total ways to fully spell "recursion"
   }
   public static void main(String[] args) {
       System.out.println(countRecursion("recursion"));       // 1
       System.out.println(countRecursion("rrecursion"));       // 2
       System.out.println(countRecursion("rrecurrsion"));      // let's trace this below
   }
}