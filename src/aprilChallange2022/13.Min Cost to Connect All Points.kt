package aprilChallange2022

import java.util.*
import kotlin.Comparator
import kotlin.math.abs

class Solution13 {
    val parents = IntArray(1001)
    fun minCostConnectPoints(points: Array<IntArray>): Int {
        var ans = 0
        val edges = ArrayList<Pair<Pair<Int, Int>, Int>>()
        for (i in points.indices)
            parents[i] = i
        for (i in points.indices) {
            for (j in i+1..points.size-1)
                edges.add(Pair(Pair(i, j), getDist(points[i], points[j])))
        }
        edges.sortWith(Comparator<Pair<Pair<Int, Int>, Int>> { o1, o2 -> o1.second - o2.second })

        edges.forEach {
            if (union(it.first.first, it.first.second))
                ans += it.second
        }
        return ans
    }

    fun getDist(p1: IntArray, p2: IntArray): Int {
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1])
    }

    fun union(u: Int, v: Int): Boolean {
        val p1 = find(u)
        val p2 = find(v)
        if (p1 != p2) {
            parents[p1] = p2
            return true
        }
        return false
    }

    private fun find(u: Int): Int {
        if (parents[u] != u)
            parents[u] = find(parents[u])
        return parents[u]
    }
}

fun main() {
    val sol = Solution13()
    sol.minCostConnectPoints(
        arrayOf(
            intArrayOf(0, 0),
            intArrayOf(2, 2),
            intArrayOf(3, 10),
            intArrayOf(5, 2),
            intArrayOf(7, 0)
        )
    )
}