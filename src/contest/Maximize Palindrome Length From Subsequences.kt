package contest

class Solution3 {
    fun longestPalindrome(word1: String, word2: String): Int {
        val s = word1 + word2
        val dp = Array(s.length) { IntArray(s.length) { 0 } }
        var res = 0

        for (i in s.length - 1 downTo 0) {
            dp[i][i] = 1
            for (j in i + 1 until s.length) {
                if (s[i] == s[j]) {
                    dp[i][j] = dp[i + 1][j - 1] + 2
                    if (i in word1.indices && j in word1.length until s.length)
                        res = Math.max(res, dp[i][j])
                } else
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j])

            }
        }
        return res
    }
}

fun main() {
    val sol = Solution3()
    print(sol.longestPalindrome("ceebeddc", "d"))
}