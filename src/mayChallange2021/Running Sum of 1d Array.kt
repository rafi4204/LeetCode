package mayChallange2021

class Solution {
    fun runningSum(nums: IntArray): IntArray {
        val res = IntArray(nums.size)
        res[0] = nums[0]
        for (i in 1 until nums.size) {
            res[i] = res[i - 1] + nums[i]
        }
        return res
    }
}