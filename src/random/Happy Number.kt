package random

class Solution17 {
    fun isHappy(nn: Int): Boolean {
        val map = hashMapOf<Int, Int>()
        var n = nn

        while (map[n] == null) {
            map[n] = 1
            n = addDigit(n)
            if (n == 1)
                return true

        }
        return false
    }

    fun addDigit(n: Int): Int {
        var res = 0
        var nn = n
        while (nn != 0) {
            res += ((nn % 10) * (nn % 10))
            nn /= 10
        }
        return res
    }
}