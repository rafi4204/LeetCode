package mayChallange2021

class Solution11 {
    fun maximumUniqueSubarray(nums: IntArray): Int {
        var ans = Int.MIN_VALUE
        val seen = hashMapOf<Int, Int>()
        var l = 0
        var r = 0
        var sum = 0
        while (r <= nums.size - 1) {
            var x = nums[r]

            if (seen[nums[r]] != null) {
                val index = seen[nums[r]]!!
                while (l <= index) {
                    seen.remove(nums[l])
                    sum-=nums[l]
                    l++
                }


            }
            sum += x
            seen[nums[r]] = r
            ans = Math.max(sum, ans)
            r++
        }
        return ans
    }
}