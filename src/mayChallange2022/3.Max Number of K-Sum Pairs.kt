package mayChallange2022

class Solution3 {
    fun maxOperations(nums: IntArray, k: Int): Int {
        val map = hashMapOf<Int, Int>()
        var c = 0
        for (i in nums.indices)
            map[nums[i]] = map.getOrDefault(nums[i], 0) + 1

        for (i in nums.indices) {
            if ( map[ nums[i]]!! > 0&&map[k - nums[i]] != null && map[k - nums[i]]!! > 0) {
                if(nums[i]==k-nums[i]&&map[nums[i]]!!<2) continue
                map[k - nums[i]] = map[k - nums[i]]!! - 1
                map[nums[i]] = map[nums[i]]!! - 1
                c++
            }
        }
        return c
    }
}