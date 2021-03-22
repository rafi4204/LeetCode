package dp

class Solution2 {
    fun climbStairs(n: Int): Int {
        val dp = Array(n + 1) { IntArray(2) { 0 } }
        dp[0][1] = 1
        dp[0][0] = 1
        for (i in 1..n) {
            dp[i][0] = dp[i - 1][1]
            dp[i][1] = dp[i - 1][1] + dp[i - 1][0]
        }
        return dp[n][1]
    }
}