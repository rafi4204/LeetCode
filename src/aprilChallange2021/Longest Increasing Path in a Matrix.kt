package aprilChallange2021

class Solution6 {
    val x = intArrayOf(0, 0, 1, -1)
    val y = intArrayOf(-1, 1, 0, 0)
    var mx = 1
    fun longestIncreasingPath(matrix: Array<IntArray>): Int {
        val dp = Array(matrix.size) { IntArray(matrix[0].size) { -1 } }
        for (i in matrix.indices) {
            for (j in matrix[0].indices) {
                if (dp[i][j] == -1)
                    dfs(dp, matrix, i, j)
            }
        }
        return mx
    }

    private fun dfs(dp: Array<IntArray>, matrix: Array<IntArray>, i: Int, j: Int): Int {
        var mxl = 1
        for (k in x.indices) {
            if (i + x[k] in matrix.indices && j + y[k] in matrix[0].indices && matrix[i + x[k]][j + y[k]] > matrix[i][j]) {
                if (dp[i + x[k]][j + y[k]] == -1)
                    mxl = Math.max(dfs(dp, matrix, i + x[k], j + y[k]) + 1, mxl)
                else
                    mxl = Math.max(dp[i + x[k]][j + y[k]] + 1, mxl)

            }
        }
        dp[i][j] = mxl
        mx = Math.max(mx, mxl)

        return mxl
    }
}