package mayChallange2021

class Solution1 {
    fun checkPossibility(nums: IntArray): Boolean {
        var c = 0

        for (i in 1 until nums.size) {
            if (nums[i] < nums[i - 1]) {
                if (i == 1 || (i != 1 && nums[i] >= nums[i - 2]))
                    nums[i - 1] = nums[i]
                else
                    nums[i] = nums[i - 1]

                c++
            }

        }
        return c <= 1
    }
}