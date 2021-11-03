package dataStructure

import java.util.*

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val map = TreeMap<Int, Int>()
        nums.forEachIndexed { index, i ->
            if (map[i] != null)
                map[i] = map[i]!! + 1
            else
                map[i] = 1
            if (map[i]!! > 1)
                return true
        }
        return false
    }
}