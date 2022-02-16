package random

class Solution2 {
    fun plusOne(digits: IntArray): IntArray {

        for (i in digits.size - 1 downTo 0) {
            if (digits[i] < 9) {
                digits[i] += 1
                return digits
            }
            digits[i] = 0
        }
        val res = IntArray(digits.size + 1)
        res[0] = 1
        return res
    }
}