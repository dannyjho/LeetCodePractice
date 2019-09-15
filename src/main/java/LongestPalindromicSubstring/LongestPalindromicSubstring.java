package LongestPalindromicSubstring;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }
        if (s == null || s.length() <= 1) {
            return s;
        }

        boolean[][] dp = new boolean[s.length()][s.length()];
        int i, j;
        for (i = 0; i < s.length(); i++) {
            for (j = 0; j < s.length(); j++) {
                if (i >= j) {
                    dp[i][j] = true;
                } else {
                    dp[i][j] = false;
                }
            }
        }

        int maxLength = 1;
        int startPoint = 0, endPoint = 0;
        for (int k = 1; k < s.length(); k++) {
            for (i = 0; k + i < s.length(); i++) {
                j = i + k;
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    dp[i][j] = dp[i + 1][j - 1];
                    if (dp[i][j]) {
                        if (k + 1 > maxLength) {
                            maxLength = k + 1;
                            startPoint = i;
                            endPoint = j;
                        }
                    }
                }
            }
        }
        return s.substring(startPoint, endPoint + 1);
    }
}
