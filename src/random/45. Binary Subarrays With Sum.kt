package random

class Solution45 {
    fun numSubarraysWithSum(nums: IntArray, goal: Int): Int {
        var i = 0
        var c = 0
        var sum = 0
        for (j in nums.indices) {
           sum+=nums[j]
            if(sum>goal){
                while(sum>=goal){
                    sum-=nums[i++]
                    if(sum == goal)
                        c++
                }
            }
            if(sum == goal)
            c++
        }
        return c
    }
}