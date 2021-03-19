package dp

class Solution1 {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val dp = Array(cost.size) { IntArray(2) { 0 } }
        dp[0][1] = cost[0]
        for (i in 1 until cost.size) {
            dp[i][0] = dp[i - 1][1]
            dp[i][1] = Math.min(dp[i - 1][0] + cost[i], dp[i - 1][1] + cost[i])
        }

        return Math.min(dp[cost.size - 1][0], dp[cost.size - 1][1])
    }
}