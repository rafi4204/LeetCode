package dp

class Solution10 {
    fun maximalSquare(matrix: Array<CharArray>): Int {
        val m = matrix.size
        val n = matrix[0].size
        var largest = -1
        val mat = Array(m + 1) { CharArray(n + 1) { '1' } }
        val dp = Array(m + 1) { IntArray(n + 1) { 0 } }
        for (i in 1..m)
            for (j in 1..n) {
                mat[i][j] = matrix[i - 1][j - 1]
            }

        for (i in 1..m)
            for (j in 1..n) {
                if (mat[i][j] == '1')
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]) + 1

                if (largest < dp[i][j])
                    largest = dp[i][j]


            }

        return largest * largest
    }
}

fun main() {
    val sol = Solution10()
    sol.maximalSquare(
        arrayOf(
            charArrayOf('1', '0', '1', '0', '0'),
            charArrayOf('1', '0', '1', '1', '1'),
            charArrayOf('1', '1', '1', '1', '1'),
            charArrayOf('1', '0', '0', '1', '0')
        )
    )
}