package binarySearch

class Solution4 {
    fun findPeakElement(nums: IntArray): Int {
        var l = 0
        var r = nums.size-1
        var mid = 0

        while (l < r) {
            mid = (r + l) / 2
            if (nums[mid] > nums[mid + 1])
                r = mid
            else
                l = mid + 1
        }
        return l
    }
}