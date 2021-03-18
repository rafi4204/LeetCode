package marchChallange2021

class Solution14 {
    fun maxProfit(prices: IntArray, fee: Int): Int {
       val dp = Array(prices.size){IntArray(2){0} }
        dp[0][0]= 0
        dp[0][1] = -prices[0]-fee
        for(i in 1 until prices.size){
            dp[i][0] = Math.max(dp[i-1][1]+prices[i],dp[i-1][0])
            dp[i][1] = Math.max(dp[i-1][0]-prices[i]-fee,dp[i-1][1])
        }
        return dp[prices.size-1][0]
    }
}