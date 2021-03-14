package marchChallange2021

class Solution10 {
    fun coinChange(coins: IntArray, amount: Int): Int {
        coins.sort()
        val dp = Array(coins.size) { IntArray(amount + 1) { -1 } }
        dp.forEach { it[0] = 0 }

        for (i in coins.indices) {
            for (j in 1..amount) {
                if (coins[i] <= j)
                    dp[i][j] = Math.min(dp[i][j - coins[i]] + 1, if (i - 1 < 0) 999999999 else dp[i - 1][j])
                else
                    dp[i][j] = if (i - 1 < 0) 999999999 else dp[i - 1][j]
            }
        }
        return if (dp[coins.size - 1][amount] == 999999999) -1 else dp[coins.size - 1][amount]

    }
}

fun main() {
    val sol = Solution10()
    print(sol.coinChange(intArrayOf(1), 0))
}