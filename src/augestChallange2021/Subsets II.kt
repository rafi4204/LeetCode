package augestChallange2021

class Solution1 {
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        val res = ArrayList<List<Int>>()
        val n = Math.pow(2.0, nums.size.toDouble()).toInt()
        val map = hashMapOf<List<Int>, Int>()
        for (i in 0..n) {
            var temp = arrayListOf<Int>()
            for (j in nums.indices) {
                if (i.and(1.shl(j))==1.shl(j)) {
                    temp.add(nums[j])
                }
            }
            if (map[temp.sorted()] == null)
                res.add(temp)
            map[temp.sorted()] = 1
        }

        return res
    }
}

fun main(){
    val sol = Solution1()
    sol.subsetsWithDup(intArrayOf(1,2,3))
}