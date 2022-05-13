package random

class Solution45 {
    fun numSubarraysWithSum(nums: IntArray, goal: Int): Int {
      return countSub(nums, goal) - countSub(nums, goal - 1)
    }

    private fun countSub(nums: IntArray, k: Int): Int {
        var i = 0
        var c = 0
        var sum = 0
        for (j in nums.indices) {
            sum += nums[j]
            while (sum > k) {
                sum -= nums[i++]
            }
            c += j - i + 1
        }
        return c
    }
}