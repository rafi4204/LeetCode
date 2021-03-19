package marchChallange2021

class Solution15 {
    fun wiggleMaxLength(nums: IntArray): Int {
        val dp = Array(nums.size) { IntArray(2) { 0 } }
        dp[0][0] = 1
        dp[0][1] = 1
        for (i in 1 until nums.size) {
            if (nums[i - 1] > nums[i]) {
                dp[i][0] = Math.max(dp[i - 1][1] + 1, dp[i - 1][0])
                dp[i][1] = dp[i - 1][1]
            } else if (nums[i - 1] < nums[i]) {
                dp[i][0] = dp[i - 1][0]
                dp[i][1] = Math.max(dp[i - 1][0] + 1, dp[i - 1][1])
            } else {
                dp[i][0] = dp[i - 1][0]
                dp[i][1] = dp[i - 1][1]
            }
        }
        return Math.max(dp[nums.size - 1][0], dp[nums.size - 1][1])
    }
}