package twoPointers

class Solution9 {
    fun sortColors(nums: IntArray): Unit {
        var start = 0
        var end = nums.size - 1
        var index = 0
        while (index <= end && start < end) {
            if (nums[index] == 0) {
                nums[index] = nums[start]
                nums[start] = 0
                start++
                index++
            } else if (nums[index] == 2) {
                nums[index] = nums[end]
                nums[end] = 2
                end--

            } else {
                index++
            }

        }
    }
}