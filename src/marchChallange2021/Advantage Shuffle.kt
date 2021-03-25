package marchChallange2021

import java.util.*
import kotlin.Comparator

class Solution19 {
    fun advantageCount(A: IntArray, B: IntArray): IntArray {
        val temp1 = A.sortedArrayDescending()
        val v = Vector<Pair<Int, Int>>()
        for (i in B.indices) {
            v.addElement(Pair(i, B[i]))
        }
        v.sortWith(object : Comparator<Pair<Int, Int>> {
            override fun compare(o1: Pair<Int, Int>, o2: Pair<Int, Int>): Int {
                return o2.second.compareTo(o1.second)
            }
        })
        var res = IntArray(A.size) { -1 }
        var i = 0
        var j = 0

        var k = 1
        while (i < temp1.size && j < temp1.size) {
            if (temp1[i] <= v[j].second) {
                res[v[j].first] = temp1[temp1.size - k++]
                j++
            } else {
                res[v[j].first] = temp1[i]
                i++
                j++
            }

        }

        return res
    }
}

fun main() {
    val sol = Solution19()
    sol.advantageCount(intArrayOf(2, 0, 4, 1, 2), intArrayOf(1, 3, 0, 0, 2))
}