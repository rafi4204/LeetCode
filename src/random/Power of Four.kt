package random

class Solution26 {
    fun isPowerOfFour(n: Int): Boolean {

        return n > 0 && n.and(n - 1) == 0 && n % 3 == 1

    }
}