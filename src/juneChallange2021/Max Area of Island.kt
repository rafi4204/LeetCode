package juneChallange2021

class Solution {
    val x = intArrayOf(1, -1, 0, 0)
    val y = intArrayOf(0, 0, -1, 1)
    var max = Int.MIN_VALUE
    var c = 0
    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        val vis = Array(grid.size) { IntArray(grid[0].size) { 0 } }
        val list = arrayListOf<Pair<Int, Int>>()
        for (i in grid.indices)
            for (j in grid[0].indices)
                if (grid[i][j] == 1)
                    list.add(Pair(i, j))

        if (list.isEmpty())
            return 0

        for (i in list.indices) {
            if (vis[list[i].first][list[i].second] == 0) {
                c= 0
                dfs(list[i].first, list[i].second, vis, grid)
            }
        }
        return max
    }

    private fun dfs(i: Int, j: Int, vis: Array<IntArray>, grid: Array<IntArray> ): Int {
        vis[i][j] = 1
        c++
        max = Math.max(c,max)
        for (k in x.indices) {
            if (i + x[k] in vis.indices && j + y[k] in vis[0].indices && vis[i + x[k]][j + y[k]] == 0 && grid[i + x[k]][j + y[k]] == 1)
                dfs(i + x[k], j + y[k], vis, grid )
        }

        return c

    }
}

fun main() {
    val sol = Solution()
    val ar = arrayOf(
        intArrayOf(0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
        intArrayOf(0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
        intArrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0),
        intArrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0)
    )

    sol.maxAreaOfIsland(ar)
}