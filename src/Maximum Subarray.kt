class Solution4 {
    fun maxSubArray(nums: IntArray): Int {
        var mx = Int.MIN_VALUE
        var sum = 0
        var slow = 0
        var fast = 0
        while (fast in nums.indices) {
            if (sum < 0)
                sum = 0
            sum += nums[fast]
            if (sum > mx)
                mx = sum
            fast++
        }
        return mx
    }
}

fun main(){
    val sol = Solution4()
    sol.maxSubArray(intArrayOf(-2,1,-3,4,-1,2,1,-5,4))
}