package dp

class Solution1 {
    val mem = hashMapOf<Int, Int>()
    fun minCostClimbingStairs(cost: IntArray): Int {
        /*val dp = Array(cost.size) { IntArray(2) { 0 } }
        dp[0][1] = cost[0]
        for (i in 1 until cost.size) {
            dp[i][0] = dp[i - 1][1]
            dp[i][1] = Math.min(dp[i - 1][0] + cost[i], dp[i - 1][1] + cost[i])
        }

        return Math.min(dp[cost.size - 1][0], dp[cost.size - 1][1])*/
        topDown(cost.size-1,cost)
        if(cost.size<3)
            return Math.min(cost[0],cost[1])
        else
            return Math.min(mem[cost.size-1]!!,mem[cost.size-2]!!)
    }

    fun topDown(i: Int, cost: IntArray): Int {
        if (i == 0){ mem[i] = cost[i]
            return cost[i] }
        if (i == 1) {
            mem[i] = cost[i]
            return cost[i]}
        if (mem[i] == null)
            mem[i] = Math.min(topDown(i - 1, cost)+cost[i] , topDown(i - 2, cost) + cost[i])
        return mem[i]!!
    }
}