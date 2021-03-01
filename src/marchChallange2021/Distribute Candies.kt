package marchChallange2021

import java.util.*

class Solution1 {
    fun distributeCandies(candyType: IntArray): Int {
        val candy = TreeSet<Int>()
        val count = candyType.size/2
        candyType.forEach { candy.add(it) }
        return Math.min(count,candy.size)
    }
}