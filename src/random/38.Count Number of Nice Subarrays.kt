package random

class Solution38 {
    fun numberOfSubarrays(nums: IntArray, k: Int): Int {
      return slide(nums, k) - slide(nums, k - 1)
    }

    fun slide(nums: IntArray, k: Int): Int {
        var i = 0
        var c = 0
        var res = 0
        for (j in nums.indices) {
            if (nums[j] % 2 == 1)
                c++
            while (c >= k) {
                if (nums[i] % 2 == 1)
                    c--

                i++
            }
            res += j - i + 1
        }
        return res
    }

}