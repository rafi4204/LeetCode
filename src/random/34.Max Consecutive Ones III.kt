package random

class Solution34 {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var i = 0
        var j = 0
        var mxLength = 0
        var mxF = 0
        val map = hashMapOf<Int, Int>()
        for (j in nums.indices) {
            if (nums[j] == 1) {
                mxF++
            }
            if (j - i + 1 - mxF > k) {
                if (nums[i] == 1)
                    mxF--
                i++
            }
            mxLength = mxLength.coerceAtLeast(j - i + 1)
        }
        return mxLength
    }
}