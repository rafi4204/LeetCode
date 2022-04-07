package random


import java.lang.Math.log10
import kotlin.math.ln


class Solution25 {
    fun isPowerOfTwo(n: Int): Boolean {
        return n > 0 && n.and(n - 1) == 0
    }
}

fun main() {
    val sol = Solution25()
    sol.isPowerOfTwo(8)
}