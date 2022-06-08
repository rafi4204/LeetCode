package juneChallange2022

class Solution1 {
    var ans = 0
    fun totalNQueens(n: Int): Int{
        val res = ArrayList<ArrayList<String>>(n)
        val map = hashMapOf<Pair<Int, Int>, Int>()

        rec( 0, res, map, n)
        return ans
    }

    private fun rec(
         c: Int, res: ArrayList<ArrayList<String>>, map: HashMap<Pair<Int, Int>, Int>, n: Int
    ) {
        if (c == n) {
            ans++
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


