package twoPointers

class Solution11 {
    fun removeDuplicates(nums: IntArray): Int {
       var first = 0
       var last = 0
       while(last in nums.indices){
           if(nums[first]==nums[last])
               last++
           else{
               first++
               nums[first] = nums[last]
           }
       }
        return first+1
    }
}