package contest

import sun.misc.Queue

class Solution15 {
    fun nearestExit(maze: Array<CharArray>, entrance: IntArray): Int {
        val q = sun.misc.Queue<Pair<Pair<Int, Int>, Int>>()
        val row = arrayOf(0, 1, -1, 0)
        val col = arrayOf(-1, 0, 0, 1)
        val n = maze.size
        val m = maze[0].size
        val vis = Array(n) { Array(m) { 0 } }
        var c = 0

        q.enqueue(Pair(Pair(entrance[0], entrance[1]), 0))
        vis[entrance[0]][entrance[1]] = 1

        while (!q.isEmpty) {

            val p = q.dequeue()


            for (i in row.indices) {
                val x = p.first.first + row[i]
                val y = p.first.second + col[i]
                if (x in 0 until n && y in 0 until m && maze[x][y] == '.' && vis[x][y] == 0) {
                    q.enqueue(Pair(Pair(x, y), p.second + 1))
                    vis[x][y] = 1
                    if (x == 0 || x == n - 1 || y == 0 || y == m - 1) {
                        return p.second + 1
                    }

                }
            }

        }

        return -1


    }
}