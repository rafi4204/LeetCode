package marchChallenge2022

class Solution5 {
    fun findDuplicate(nums: IntArray): Int {
        var exSum = 0
        var curSum = 0
        nums.forEach {
            exSum += it
            curSum = curSum.xor(it)
        }
        return exSum - curSum
    }
}