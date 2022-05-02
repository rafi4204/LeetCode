package mayChallange2022

class Solution2 {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var index = nums.size - 1
        for (i in nums.size - 1 downTo 0) {
            if (nums[i] % 2 == 1) {
                val temp = nums[index]
                nums[index--] = nums[i]
                nums[i] = temp
            }

        }
        return nums
    }
}