package mayChallange2021

import sun.misc.Queue

class Solution2 {
    fun jump(nums: IntArray): Int {
        var farthest = 0
        var curr = -1
        var jump = 0
        if(nums.size == 1)
            return 0
        for (i in nums.indices) {
            if (i > curr) {
                jump++
                curr = farthest
            }
            farthest = Math.max(farthest, i + nums[i])
            if (farthest >= nums.size - 1)
                break
        }
        return jump
    }
}