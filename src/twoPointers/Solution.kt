package twoPointers

class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        var s = 0
        var e = nums.size - 1
        val list = IntArray(nums.size)
        var c = nums.size - 1
        while (s <= e && c >= 0) {
            if (nums[s] * nums[s] >= nums[e] * nums[e]) {
                list[c--] = nums[s] * nums[s]
                s++
            } else {
                list[c--] = nums[e] * nums[e]
                e--
            }

        }
        return list
    }
}