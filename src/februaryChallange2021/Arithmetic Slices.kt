package februaryChallange2021

class Solution19 {
    fun numberOfArithmeticSlices(A: IntArray): Int {
        if (A.size < 3)
            return 0
        var count = 0
        var result = 0
        var last_diff = A[0] - A[1]
        for (i in 1..A.size - 2) {
            if (last_diff == A[i] - A[i + 1]) {
                count++
            } else {
                last_diff =A[i] - A[i + 1]
                count = 0
            }
            result += count
        }
        return result

    }
}
