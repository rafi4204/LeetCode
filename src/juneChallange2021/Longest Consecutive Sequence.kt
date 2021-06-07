package juneChallange2021

class Solution5 {
    fun longestConsecutive(nums: IntArray): Int {
        var mx = Int.MIN_VALUE
        var count = 1
        if(nums.isEmpty())
            return 0
        nums.sort()
        var temp1 = nums.toSet()
        var temp = temp1.toList()
        for (i in 1 until temp.size) {
            if (temp[i] - temp[i - 1] != 1) {
                mx = Math.max(mx, count)
                count = 1
            } else
                count++
        }
        mx = Math.max(mx, count)
        return mx
    }
}

fun main(){
    val sol = Solution5()
    sol.longestConsecutive(intArrayOf(0,1,2,1))
}