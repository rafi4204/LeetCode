package dp

class Solution8 {
    val mem = Array(1005){IntArray(1005){0}}
    fun maximumScore(nums: IntArray, multipliers: IntArray): Int {
        return dp(0, 0, nums, multipliers)
    }

    private fun dp(i: Int, left: Int, nums: IntArray, multipliers: IntArray): Int {

        if (i == multipliers.size)
            return 0
        val r = nums.size - 1 - (i - left)

        if (mem[i][left] == 0)
            mem[i][left] = Math.max(
                nums[left] * multipliers[i] + dp(i + 1, left + 1, nums, multipliers),
                nums[r] * multipliers[i] + dp(i + 1, left, nums, multipliers)
            )
        return mem[i][left]
    }
}