package septemberChallange2021

class Solution2 {
    val dp = Array(1010) { IntArray(1010) { -1 } }
    fun numDistinct(s: String, t: String): Int {
        return dfs(0, 0, s, t)
    }

    private fun dfs(i: Int, j: Int, s: String, t: String): Int {
        if (j == t.length)
            return 1
        if (i == s.length)
            return 0

        if (dp[i][j] != -1)
            return dp[i][j]
        if (s[i] == t[j])
            dp[i][j] = dfs(i + 1, j + 1, s, t) + dfs(i + 1, j, s, t)
        else
            dp[i][j] = dfs(i + 1, j, s, t)

        return dp[i][j]

    }
}