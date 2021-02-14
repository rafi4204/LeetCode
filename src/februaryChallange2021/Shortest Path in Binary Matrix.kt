package februaryChallange2021

import sun.misc.Queue
import java.util.*

class Solution13 {

    fun shortestPathBinaryMatrix(grid: Array<IntArray>): Int {
        val dx = arrayOf(1, 1, 1, -1, -1, -1, 0, 0)
        val dy = arrayOf(0, -1, 1, 0, 1, -1, 1, -1)
        val row = grid.size
        val col = grid[0].size
        var l =0
        val visited = Array(row) { IntArray(col) { 0 } }
        val q = Queue<Pair<Int, Int>>()
        var isReachable = false
        if(grid[0][0]==0)
        q.enqueue(Pair(0, 0))
        l++
        visited[0][0] = 1
        var level = 1
        while (!q.isEmpty) {
            var ll=0
            for(ii in l downTo 1){
                val p = q.dequeue()
                if (p.first == row - 1 && p.second == col - 1) {
                    isReachable = true
                    break
                }
                for (i in dx.indices) {
                    if (p.first + dx[i] in 0 until row && p.second + dy[i] in 0 until col && visited[p.first + dx[i]][p.second + dy[i]] == 0 && grid[p.first + dx[i]][p.second + dy[i]] == 0) {
                        visited[p.first + dx[i]][p.second + dy[i]] = 1
                        q.enqueue(Pair(p.first + dx[i], p.second + dy[i]))
                        ll++
                    }
                }
            }
            l=ll

            if(isReachable)
                break
            else
                level++

        }
        return if (isReachable)
            level
        else
            -1


    }


}

fun main() {
    val sol = Solution13()
    print(sol.shortestPathBinaryMatrix(arrayOf(intArrayOf(0, 0, 0), intArrayOf(1, 1, 0), intArrayOf(1, 1, 0))))
}