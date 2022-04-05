package random

import java.util.HashMap

class Solution22 {
    val res = arrayListOf<ArrayList<Int>>()
    fun permute(nums: IntArray): List<List<Int>> {
        val map = hashMapOf<Int, Int>()
        val list = arrayListOf<Int>()

       // recur(list, nums, map)
        recur2(0, nums)
        return res
    }

    private fun recur2(index: Int, nums: IntArray) {
        if (index == nums.size ) {
            val t = arrayListOf<Int>()
            nums.forEach {
                t.add(it)
            }
            res.add(t)
            return
        }
        for (i in index until nums.size) {
            swap(i, index, nums)
            recur2(i + 1, nums)
            swap(i,index,nums)
        }

    }

    private fun swap(i: Int, j: Int, nums: IntArray) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }


    private fun recur(list: ArrayList<Int>, nums: IntArray, map: HashMap<Int, Int>) {
        if (list.size >= nums.size) {
            val temp = ArrayList<Int>(list)

            res.add(temp)
            return
        }
        nums.forEach {
            if (map[it] == null) {
                list.add(it)
                map[it] = 1
                recur(list, nums, map)
                map.remove(it)
                list.remove(it)
            }
        }
    }
}