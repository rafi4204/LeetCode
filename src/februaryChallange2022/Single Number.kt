package februaryChallange2022

class Solution1 {
    fun singleNumber(nums: IntArray): Int {
        nums.sort()
        var ans = 0
        var count = 1;
        var prv = nums[0]
        for (i in 1 until nums.size) {
            if (prv == nums[i])
                count++
            else if (prv != nums[i] && count == 1) {
                ans = prv
                break
            } else
                count = 1
            prv = nums[i]
        }
        if(ans == 0)
            ans = prv
        return ans
    }
}

fun main(){
    val sol = Solution1()
    sol.singleNumber(intArrayOf(2,2,1))
}