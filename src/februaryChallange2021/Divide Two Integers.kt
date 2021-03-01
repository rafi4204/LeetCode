package februaryChallange2021

class Solution28 {
    fun divide(dividend: Int, divisor: Int): Int {
        var q = 1
        var res: Long = 0
        var c = 0
        var a = Math.abs(dividend.toLong())
        var b = Math.abs(divisor.toLong())
        val sign = (dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)
        while (a - b >= 0) {
            q = 0
            while (a - b.shl(1).shl(q) >= 0)
                q++
            res += 1.toLong().shl(q)
            a -= b.shl(q)
        }
        if (!sign)
            res *= -1

        return if (res > 2147483647 || res < -2147483648)
            2147483647
        else
            res.toInt()
    }
}

fun main() {
    val sol = Solution28()
    print(sol.divide(-2147483648, -1))
}