package aprilChallange2021

class Solution2 {
    fun minOperations(n: Int): Int {
        val m = ((n - 1) * 2 + 3) / 2
        var res = 0
        for (i in 0 until n / 2) {
            res += m - ((2 * i) + 1)
        }
        return res
    }
}