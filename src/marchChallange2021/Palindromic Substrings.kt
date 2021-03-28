package marchChallange2021

class Solution21 {
    //solution using dp
    /*fun countSubstrings(s: String): Int {
        val dp = Array(s.length) { IntArray(s.length) { 0 } }
        var res = 0
        for (i in s.indices) {
            dp[i][i] = 1
            res++
        }
        for (col in 1 until s.length) {
            for (row in 0 until col) {
                if (col - row == 1) {
                    if (s[row] == s[col]) {
                        dp[row][col] = 1
                        res++
                    }
                } else if (s[row] == s[col] && dp[row + 1][col - 1] == 1) {
                    dp[row][col] = 1
                    res++
                }


            }
        }
        return res
    }*/

    // solution using center value
    var result = 0
    fun countSubstrings(s: String): Int {
        for (i in s.indices) {
            count(s, i, i)
            count(s, i, i + 1)
        }
        return result
    }

    private fun count(s: String, i: Int, j: Int) {
        var start = i
        var end = j
        while (start in s.indices && end in s.indices && s[start] == s[end]) {
            result++
            start--
            end++
        }

    }
}