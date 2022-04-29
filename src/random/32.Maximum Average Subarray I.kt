package random

class Solution32 {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var max = Double.MAX_VALUE *-1
        var i = 0
        var j = 0
        var sum = 0
        while (i <= nums.size - k) {
            sum += nums[j]
            if (j == i + k - 1) {
                max = Math.max(max, sum.toDouble() / k)
                sum -= nums[i++]
            }
            j++
        }
        return max
    }
}