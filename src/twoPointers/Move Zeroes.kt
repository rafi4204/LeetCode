package twoPointers

class Solution3 {
    fun moveZeroes(nums: IntArray): Unit {
        var l = 0
        var r = 0
        while (r < nums.size) {
            if (nums[r] == 0)
                r++
            else {
                val temp = nums[r]
                nums[r] = nums[l]
                nums[l] = temp
                r++
                l++
            }
        }
    }
}