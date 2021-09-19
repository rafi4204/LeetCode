package dp

class Solution4 {
    var dp = Array<Int>(500) { 0 }
    var mx = Int.MIN_VALUE
    fun rodCutting(n: Int, cost: IntArray): Int {


        rec(n, cost)

        return mx
    }

    /* private fun rec(i: Int, n: Int, c: Int, cost: IntArray) {
         if(i==n){
             mx = Math.max(mx,c)
             return
         }
         for(j in 1..n-i){
             rec(j+i, n, c+cost[j-1], cost)
         }
     }*/
    private fun rec(n: Int, cost: IntArray): Int {
        if (n == 0)
            return 0

        for (i in 1..n) {
            if (dp[i] == 0)
                dp[i] = cost[i - 1] + rec(n - i, cost)
        }
        for (i in 1..n) {
            mx = Math.max(mx, dp[i])
        }
        return mx
    }


}

fun main() {
    val sol = Solution4()
    println(sol.rodCutting(5, intArrayOf(3, 5, 7, 10, 16)))



}
inline fun <reified T> hello(t:Class<T>){
    if(t is T){

    }
}