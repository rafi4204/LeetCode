package binarySearch

import java.util.Comparator

class Solution2 {
    fun search(nums: IntArray, target: Int): Int {
        val list = arrayListOf<Pair<Int, Int>>()
        var i = 0
        nums.forEach {
            list.add(Pair(it, i++))
        }
        list.sortWith(object : Comparator<Pair<Int, Int>> {
            override fun compare(o1: Pair<Int, Int>, o2: Pair<Int, Int>): Int {
                return o1.first.compareTo(o2.first)
            }
        })

        var s = 1
        var e = nums.size-1
        while (s <= e) {
            val mid = s + (e - s) / 2
            when {
                list[mid].first == target -> return list[mid].second
                list[mid].first > target ->  e = mid - 1
                else -> s = mid + 1
            }
        }

        return -1
    }
}

fun main(){
    val sol = Solution2()
    sol.search(intArrayOf(4,5,6,7,0,1,2),0)
}