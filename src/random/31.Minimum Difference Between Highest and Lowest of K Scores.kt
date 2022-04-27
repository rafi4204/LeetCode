package random

class Solution31 {
    fun minimumDifference(nums: IntArray, k: Int): Int {
        nums.sort()
        if (k == 1 || nums.isEmpty() || nums.size == 1) return 0
        var min = Int.MAX_VALUE
        var i = 0
        var j = 0
        while (i <= nums.size - k) {
            if (Math.abs(nums[i] - nums[i + k - 1]) < min)
                min = Math.abs(nums[i] - nums[i + k - 1])
            i++
        }
        return min
    }
}