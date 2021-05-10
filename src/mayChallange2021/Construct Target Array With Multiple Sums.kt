package mayChallange2021

import java.util.*

class Solution6 {
    fun isPossible(target: IntArray): Boolean {
        val q = PriorityQueue<Long> { o1, o2 -> o2.compareTo(o1) }
        var total: Long = 0
        target.forEach {
            total += it
            q.add(it.toLong())
        }
        while (q.isNotEmpty()) {
            var temp = q.remove()
            total -= temp
            if (total == 1.toLong() || temp == 1.toLong())
                return true
            if (temp < total || total == 0.toLong() || temp.toLong() % total == 0.toLong())
                return false
            temp %= total
            total += temp
            q.add(temp)
        }
        return true
    }
}

fun main() {
    val sol = Solution6()
    sol.isPossible(intArrayOf(5, 2))
}