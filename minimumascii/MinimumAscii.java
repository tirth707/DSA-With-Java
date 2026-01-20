class MinimumAscii {
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i-1][0] + s1.charAt(i-1);
        }

        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j-1] + s2.charAt(j-1);
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    int deleteS1 = dp[i-1][j] + s1.charAt(i-1);
                    int deleteS2 = dp[i][j-1] + s2.charAt(j-1);

                    dp[i][j] = Math.min(deleteS1, deleteS2);
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "sea", s2 = "eat";
        System.out.println("Minimum delete sum: " + sol.minimumDeleteSum(s1, s2));
    }
}