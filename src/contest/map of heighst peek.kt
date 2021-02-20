package contest

import sun.misc.Queue
import java.util.*

class Solution1 {

    fun highestPeak(isWater: Array<IntArray>): Array<IntArray> {
        val dx = arrayOf(1, 0, -1, 0)
        val dy = arrayOf(0, -1, 0, 1)
        val row = isWater.size
        val col = isWater[0].size
        var l = 0
        val visited = Array(row) { IntArray(col) { 0 } }
        val value = Array(row) {
            IntArray(col) {
                -1
            }
        }
        val q = sun.misc.Queue<Pair<Int, Int>>()
        val water = sun.misc.Queue<Pair<Int, Int>>()
        for (i in isWater.indices) {
            for (j in isWater[i].indices) {
                if (isWater[i][j] == 1) {
                    q.enqueue(Pair(i, j))
                    value[i][j] = 0

                }
            }
        }
        while (!q.isEmpty) {
            val p = q.dequeue()

            for (i in dx.indices) {
                if (p.first + dx[i] in 0 until row && p.second + dy[i] in 0 until col && value[p.first + dx[i]][p.second + dy[i]] == -1) {
                    value[p.first + dx[i]][p.second + dy[i]] =value[p.first][p.second ]+ 1
                    q.enqueue(Pair(p.first + dx[i], p.second + dy[i]))

                }
            }

        }

        return value
    }


}

fun main() {
    val sol = Solution1()
    print(sol.highestPeak(arrayOf(intArrayOf(0, 1), intArrayOf(0, 0))))
}