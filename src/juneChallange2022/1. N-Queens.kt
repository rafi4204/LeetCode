package juneChallange2022

class Solution1 {
    fun solveNQueens(n: Int): List<List<String>> {
        val res = ArrayList<ArrayList<String>>(n)
        val map = hashMapOf<Pair<Int, Int>, Int>()

        rec( 0, res, map, n)
        return res
    }

    private fun rec(
         c: Int, res: ArrayList<ArrayList<String>>, map: HashMap<Pair<Int, Int>, Int>, n: Int
    ) {
        if (c == n) {
            val list = arrayListOf<String>()
            for (i in 0 until n) {
                var row = ""
                for (j in 0 until n) {
                    row += if (map[Pair(i, j)] != null)
                        "Q"
                    else
                        "."
                }
                list.add(row)
            }
            res.add(list)
        }
        for (i in 0 until n) {
            if (check(i, c, map)) {
                map[Pair(i, c)] = 1
                rec( c + 1, res, map, n)
                map.remove(Pair(i, c))
            }
        }


    }

    private fun check(r: Int, c: Int, map: HashMap<Pair<Int, Int>, Int>): Boolean {
        for (t in map.keys) {
            if (Math.abs(r - t.first) == Math.abs(c - t.second))
                return false
            if (t.first == r || t.second == c)
                return false
        }
        return true
    }

}


