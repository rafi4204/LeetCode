package aprilChallange2022

import java.util.PriorityQueue

class Solution3 {
    fun lastStoneWeight(stones: IntArray): Int {
        val q = PriorityQueue<Int>(object : Comparator<Int> {
            override fun compare(o1: Int?, o2: Int?): Int {
                return o2!! - o1!!
            }

        })
        stones.forEach {
            q.add(it)
        }
        while (q.size > 1) {
            val a = q.poll()
            val b = q.poll()
            q.add(a - b)
        }

        return q.poll()
    }
}