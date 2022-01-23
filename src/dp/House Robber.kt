package dp

class Solution6 {
    val mem = hashMapOf<Int, Int>()
    fun rob(nums: IntArray): Int {
        return dp2(0, nums)
    }

    //top down
    private fun dp(i: Int, nums: IntArray): Int {
        if (i == 0)
            return nums[i]
        if (i == 1)
            return Math.max(nums[0], nums[1])

        if (mem[i] == null)
            mem[i] = Math.max(dp(i - 1, nums), dp(i - 2, nums) + nums[i])

        return mem[i]!!

    }

    private fun dp2(i: Int, nums: IntArray): Int {
        if (i == nums.size-1 || i == nums.size-2)
            return nums[i]
        if (i == nums.size-3)
            return nums[nums.size-1]


        return Math.max(dp(i + 2,nums), dp(i + 3, nums) )+nums[i]



    }
}