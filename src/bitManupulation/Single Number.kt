package bitManupulation

class Solution {
    fun singleNumber(nums: IntArray): Int {
        var res = 0
        for (i in nums) {
            res = res.xor(i)
        }
        return res
    }
}