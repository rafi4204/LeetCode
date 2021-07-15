package julyChallange2021

class Solution3 {
    fun triangleNumber(nums: IntArray): Int {
        var res = 0
        nums.sort()
        for (i in nums.size - 1 downTo 0) {
            var hi = i - 1
            var lo = 0
            while (lo < hi) {
                if (nums[hi] + nums[lo] > nums[i]) {
                    res += hi - lo
                    hi--
                } else
                    lo++
            }
        }
        return res
    }
}