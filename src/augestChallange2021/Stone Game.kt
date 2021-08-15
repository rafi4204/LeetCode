package augestChallange2021

class Solution4 {
    /*var res = false
    fun stoneGame(piles: IntArray): Boolean {
        var list = piles.toMutableList()
          rec(list,1,0,0,0)
          rec(list,1,0,0,list.lastIndex)
        return res
    }

    private fun rec(piles: MutableList<Int>, i: Int, sumA: Int, sumL: Int, index: Int) {
        if(piles.isEmpty()){
            if(sumA>sumL)
                res = true
            return
        }
        if(i==1) {
           val t = sumA +piles[index]
            piles.removeAt(index)
            rec(piles,-1,t,sumL,piles.lastIndex)
            rec(piles,-1,t,sumL,0)

        } else{
            val t = sumL +piles[index]
            piles.removeAt(index)
            rec(piles,1,sumA,t,piles.lastIndex)
            rec(piles,1,sumA,t,0)
        }

    }*/
    val dp = Array(500) { IntArray(500) { -1 } }
    fun stoneGame(piles: IntArray): Boolean {

        return rec(0, piles.size - 1, piles) > 0

    }

    private fun rec(i: Int, j: Int, piles: IntArray): Int {
        if (i > j) return 0
        if (dp[i][j] != -1)
            return dp[i][j]
        dp[i][j] = Math.max(piles[i] - rec(i + 1, j, piles), piles[j] - rec(i, j - 1, piles))
        return dp[i][j]

    }
}