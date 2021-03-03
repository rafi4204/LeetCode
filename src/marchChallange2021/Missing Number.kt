package marchChallange2021

class Solution3 {
   /* fun missingNumber(nums: IntArray): Int {
        var lost = -1
        nums.sort()
        for (i in nums.indices) {
            if (i != nums[i]) {
                lost = i
                break
            }
        }
        if (lost == -1)
            lost = nums.size
        return lost
    }*/

    fun missingNumber(nums: IntArray): Int {
        var ans = (nums.size * (nums.size + 1)) / 2
         nums.fold(ans) { acc, i -> acc - i }
        return nums.fold(ans) { acc, i -> acc - i }
    }
}
fun main(){
    val sol = Solution3()
    sol.missingNumber(intArrayOf(0,2,3))
}