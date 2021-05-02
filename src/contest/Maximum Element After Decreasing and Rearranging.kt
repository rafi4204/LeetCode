package contest

class Solution11 {
    fun maximumElementAfterDecrementingAndRearranging(arr: IntArray): Int {
        var ar = arr.sorted().toMutableList()
        var max = Long.MIN_VALUE
        var prv: Long = 1.toLong()
        ar[0] = 1
        if (arr.size == 1)
            return 1
        for (i in 1 until arr.size) {
            if (Math.abs(ar[i] - ar[i - 1]) > 1) {
                ar[i] = (prv + 1).toInt()

            }
            prv = ar[i].toLong()
            if (max < prv)
                max = prv

        }
        return max.toInt()

    }
}