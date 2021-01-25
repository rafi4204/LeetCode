package januray2021Challange

class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
         nums.sort()
        return nums[nums.size-k]


    }
}