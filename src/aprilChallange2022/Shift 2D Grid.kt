package aprilChallange2022

class Solution5 {
    fun shiftGrid(grid: Array<IntArray>, kk: Int): List<List<Int>> {
        val res = ArrayList<ArrayList<Int>>()
        val temp = ArrayList<ArrayList<Int>>()
        var k = kk
        val m = grid.size
        val n = grid[0].size
        for (i in grid.indices) {
            temp.add(ArrayList<Int>(n))
            res.add(ArrayList<Int>(n))
            for (j in grid[0].indices) {
                temp[i].add(grid[i][j])
                res[i].add(grid[i][j])
            }
        }
        while (k >0) {
            k--
            for (i in grid.indices) {
                for (j in grid[0].indices) {
                    if (i == m - 1 && j == n - 1)
                        res[0][0] = temp[i][j]
                    else if (j == n - 1)
                        res[i + 1][0] = temp[i][j]
                    else
                        res[i][j+1]=temp[i][j]
                }
            }
            for (i in grid.indices) {
                for (j in grid[0].indices) {
                    temp[i][j]=res[i][j]
                }
            }
        }
        return res
    }
}