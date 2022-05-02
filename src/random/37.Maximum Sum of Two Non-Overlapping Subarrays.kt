package random

class Solution37 {
    fun maxSumTwoNoOverlap(nums: IntArray, firstLen: Int, secondLen: Int): Int {
        var max1 = Pair(0, Pair(0, 0))
        var max2 = 0
        var i = 0
        var sum = 0
        for (j in nums.indices) {
            sum += nums[j]
            if (j - i + 1 == firstLen) {
                if (max1.first < sum)
                    max1 = Pair(sum, Pair(i, j))
                sum -= nums[i]
                i++
            }
        }
        for(i in max1.second.first..max1.second.second){
            nums[i] = 0
        }
        i =0
        sum = 0
        for (j in nums.indices) {
            sum += nums[j]
            if (j - i + 1 == secondLen) {
                if (max2 < sum)
                    max2 = sum
                sum -= nums[i]
                i++
            }
        }
        return max1.first+max2
    }
}