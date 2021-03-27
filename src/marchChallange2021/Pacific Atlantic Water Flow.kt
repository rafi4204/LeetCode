package marchChallange2021

class Solution20 {
    val map1 = hashMapOf<Pair<Int, Int>, Int>()
    val map2 = hashMapOf<Pair<Int, Int>, Int>()
    val v1 = Array(150) { IntArray(150) { 0 } }
    val v2 = Array(150) { IntArray(150) { 0 } }
    val x = intArrayOf(-1, 1, 0, 0)
    val y = intArrayOf(0, 0, -1, 1)
    val res = arrayListOf<List<Int>>()

    fun pacificAtlantic(matrix: Array<IntArray>): List<List<Int>> {

        for (i in matrix[0].indices)
            dfs(0, i, matrix.size, matrix[0].size, matrix, 1, v1)
        for (i in matrix.indices)
            dfs(i, 0, matrix.size, matrix[0].size, matrix, 1, v1)
        for (i in matrix[0].indices)
            dfs(matrix.size - 1, i, matrix.size, matrix[0].size, matrix, 2, v2)
        for (i in matrix.indices)
            dfs(i, matrix[0].size - 1, matrix.size, matrix[0].size, matrix, 2, v2)
        map1.forEach {
            if (map2[it.key] != null)
                res.add(listOf(it.key.first, it.key.second))
        }

        return res
    }

    private fun dfs(i: Int, j: Int, m: Int, n: Int, matrix: Array<IntArray>, i1: Int, v: Array<IntArray>) {
        v[i][j] = 1
        if (i1 == 1) {
            map1[Pair(i, j)] = 1


        } else {
            map2[Pair(i, j)] = 1

        }
        for (k in x.indices) {
            if (i + x[k] in 0 until m && j + y[k] in 0 until n && matrix[i][j] <= matrix[i + x[k]][j + y[k]] && v[i + x[k]][j + y[k]] == 0) {
                dfs(i + x[k], j + y[k], m, n, matrix, if (i1 == 1) 1 else 2, v)
            }
        }


    }
}

fun main() {
    val sol = Solution20()
    sol.pacificAtlantic(
        arrayOf(
            intArrayOf(1, 2, 2, 3, 5),
            intArrayOf(3, 2, 3, 4, 4),
            intArrayOf(2, 4, 5, 3, 1),
            intArrayOf(6, 7, 1, 4, 5),
            intArrayOf(5, 1, 1, 2, 4)
        )
    )
}