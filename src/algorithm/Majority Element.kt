package algorithm

class Solution {
    fun majorityElement(nums: IntArray): Int {
        var cand = 0
        var c = 0
        for (i in nums) {
            if (c == 0)
                cand = i
            if (cand == i)
                c += 1
            else
                c -= 1

        }
        return cand
    }
}