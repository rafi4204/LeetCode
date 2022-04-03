package aprilChallange2022

class Solution {
    fun nextPermutation(nums: IntArray): Unit {
        var hPeak = nums.size - 1
        var lPeak = 0

        for (i in nums.size - 1 downTo 1) {
            if (nums[i] > nums[i - 1]) {
                lPeak = i - 1
                break
            }
        }
        for (i in nums.size - 1 downTo lPeak) {
            if (nums[i] > nums[lPeak]) {
                hPeak = i
                break
            }
        }

        var temp = nums[lPeak]
        nums[lPeak] = nums[hPeak]
        nums[hPeak] = temp
        lPeak++
        hPeak = nums.size - 1

        nums.sort(lPeak, hPeak + 1)


    }
}