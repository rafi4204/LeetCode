package septemberChallange2021

class Solution1 {
    fun arrayNesting(nums: IntArray): Int {
     val map = hashMapOf<Int,Int>()
        var i = 0
        var c = 0
        while(map[nums[i]]==null){
            c++
            i = nums[i]
        }

        return c
    }
}