package mayChallange2022

import java.util.*
import kotlin.Comparator
import kotlin.collections.ArrayList

class Solution8 {
    fun networkDelayTime(times: Array<IntArray>, n: Int, k: Int): Int {
        val map = hashMapOf<Int, ArrayList<Int>>()
        val map2 = hashMapOf<Pair<Int, Int>, Int>()
        val q = LinkedList<Pair<Int, Int>>()

        var mx = Int.MIN_VALUE
        val cost = IntArray(n + 1) { Integer.MAX_VALUE }

        for (i in 1..n) {
            map[i] = ArrayList<Int>()
        }
        for (i in times.indices) {
            map[times[i][0]]?.add(times[i][1])
            map2.putIfAbsent(Pair(times[i][0], times[i][1]), times[i][2])

        }
        cost[k] = 0
        q.add(Pair(k, cost[k]))

        while (q.isNotEmpty()) {


            q.sortWith(object:kotlin.Comparator<Pair<Int,Int>>{
                override fun compare(o1: Pair<Int, Int>, o2: Pair<Int, Int>): Int {
                    return o1.second-o2.second
                }

            })
            val pair = q.removeAt(0)
           val v = pair.first
            for (i in map[v]!!.indices) {
                if(cost[map[v]!![i]]>cost[v] + map2[Pair(v, map[v]!![i])]!!) {
                    q.add(Pair(map[v]!![i], cost[map[v]!![i]]))
                    cost[map[v]!![i]] = Math.min(cost[map[v]!![i]], cost[v] + map2[Pair(v, map[v]!![i])]!!)
                }

             }
        }

        for(i in 1..n){
            mx = mx.coerceAtLeast(cost[i])
        }

        return if(mx== Int.MAX_VALUE) -1 else mx
    }
}

fun main() {
    val sol = Solution8()
    val res = arrayOf(intArrayOf(1, 2, 1), intArrayOf(2, 3, 7), intArrayOf(1, 3, 4), intArrayOf(2, 1, 2))
    sol.networkDelayTime(res, 3, 2)
}