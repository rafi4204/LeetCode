package twoPointers

class Solution2 {
    fun rotate(nums: IntArray, k: Int): Unit {
        val kk = k % nums.size
        reverseArray(nums, 0, nums.size - 1)
        reverseArray(nums, 0, kk-1)
        reverseArray(nums, kk, nums.size - 1)
    }

    private fun reverseArray(nums: IntArray, ii: Int, jj: Int) {
        var i = ii
        var j = jj
        while (i <= j) {
            val temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            i++
            j--
        }
    }
}