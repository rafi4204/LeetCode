package dp

class Solution3 {
    fun maxProfit(prices: IntArray): Int {
        var min = Integer.MAX_VALUE
        var profit = 0
        for (i in prices.indices) {
            if (min > prices[i])
                min = prices[i]
            else if (profit < prices[i] - min)
                profit = prices[i] - min

        }
        return profit

    }
}