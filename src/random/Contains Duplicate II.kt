package random

class Solution23 {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = hashMapOf<Int, Int>()
        for (i in nums.indices) {
            if (map[nums[i]] != null) {
                if (Math.abs(map[nums[i]]!! - i) <= k)
                    return true
            }
            map[nums[i]] = i
        }
        return false
    }
}