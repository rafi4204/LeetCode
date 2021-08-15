package augestChallange2021

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var res = intArrayOf()
        val map = hashMapOf<Int, Int>()
        for (i in nums.indices) {
            map[nums[i]] = i
        }
        for (i in nums.indices) {
            if (map[target - nums[i]] != null ) {
                if(target-nums[i]==nums[i] && map[nums[i]]==i)
                    continue
                else{
                    res = intArrayOf(i, map[target - nums[i]]!!)
                    break
                }
            }
        }
        return res

    }
}