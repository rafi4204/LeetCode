package random

class Solution36 {
    fun longestSubarray(nums: IntArray): Int {
        var i = 0
        var cZero = 0
        var c = 0
        var mxL = 0
        if(!nums.contains(0)) return nums.size-1
        for (j in nums.indices) {
            if (nums[j] == 1)
                c++
            if (nums[j] == 0)
                cZero++
            while (cZero > 1) {
                if (nums[i] == 0)
                    cZero--
                else
                    c--
                i++
            }
            mxL = mxL.coerceAtLeast(c)
        }
        return mxL
    }
}