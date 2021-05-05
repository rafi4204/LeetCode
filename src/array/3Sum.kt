package array

class Solution2 {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        val map = hashMapOf<Int,Int>()
        nums.sort()
        nums.forEach { map[it] = 0 }
        for (i in nums.indices) {
            if (i != 0 && nums[i] == nums[i - 1]) continue
            for (j in i + 1 until nums.size) {
                if (j != i + 1 && nums[j] == nums[j - 1]) continue
                      if(map[-nums[i]-nums[j]] == 0 ) {
                          res.add(listOf(nums[i], nums[j], -nums[i]-nums[j]))
                          map[-nums[i]-nums[j]] = -1
                      }
                }
            }

        return res
    }
}