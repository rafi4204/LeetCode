package februaryChallange2021

class Solution26 {
    fun findUnsortedSubarray(nums: IntArray): Int {
        val list = arrayListOf<Int>()
        var temp = arrayListOf<Int>()
        for (i in nums.indices)
           temp.add(nums[i])

        temp.sort()
        for (i in temp.indices) {
            if (temp[i] != nums[i])
                list.add(i)
        }
        if(list.isNotEmpty())
        list.sort()
        return if (list.isEmpty()) 0 else list.last() - list.first()+1

    }
}

fun main() {
    val sol = Solution26()
    sol.findUnsortedSubarray(intArrayOf(2,6,4,8,10,9,15))
}