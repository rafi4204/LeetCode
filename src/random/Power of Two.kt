package random


import java.lang.Math.log10
import kotlin.math.ln


class Solution25 {
    fun isPowerOfTwo(n: Int): Boolean {
        return Math.log10(n.toDouble()) % Math.log10(2.00) == 0.00
    }
}
fun main(){
    val sol = Solution25()
    sol.isPowerOfTwo(8)
}