package marchChallenge2022

class Solution1 {
    fun countBits(n: Int): IntArray {
        val res = IntArray(n) { 1 }
        res[0] = 1

        for (i in 1..n) {
            if (i % 2 == 0) {
                res[i] = res[i / 2]
            } else {
                res[i] = res[i / 2] + 1
            }
        }
        return res
    }
}