package binarySearch

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.size-1
        while(l<=r){
            var mid = l+(r-l)/2
            if(nums[mid] == target){
                return mid
            }
            if(nums[mid]<target)
                l = mid+1
            if(nums[mid]>target)
                r = mid-1
        }
        return l
    }
}