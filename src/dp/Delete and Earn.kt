package dp

import java.util.ArrayList

class Solution7 {
    val map = hashMapOf<Int, Int>()
    fun deleteAndEarn(num: IntArray): Int {

        num.sort()
        val nums1 = num.toSet()
        val nums = nums1.toIntArray()

        num.forEach {
            if (map[it] == null)
                map[it] = 1
            else
                map[it] = map[it]!! + 1
        }

        var earn1 = 0
        var earn2 = 0
        for (i in nums.indices) {
            var cur = nums[i] * map[nums[i]]!!
            if (i > 0 && nums[i] == nums[i - 1] + 1) {
                val temp1 = earn2
                earn2 = Math.max(cur + earn1, earn2)
                earn1 = temp1
            } else {
                val temp2 = earn2
                earn2 += cur
                earn1 = temp2
            }

        }

        return earn2

    }


}

fun main() {
    val sol = Solution7()
    sol.deleteAndEarn(intArrayOf(2, 2, 3, 3, 3, 4))
}