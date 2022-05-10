package mayChallange2022

class Solution5 {
    fun combinationSum3(k: Int, n: Int): List<List<Int>> {
        var res = arrayListOf<ArrayList<Int>>()
        comb(0, 0, arrayListOf(), n, res, k)
        return res
    }

    private fun comb(v: Int, sum: Int, list: ArrayList<Int>, n: Int, res: ArrayList<ArrayList<Int>>, k: Int) {
        if (sum == n && list.size == k) {
            val list2 = ArrayList(list)
            res.add(list2)
            return
        }

        for (j in v+1 until n) {
            list.add(j)
            comb(j, sum + j, list, n, res, k)
            list.removeAt(list.size-1)
        }
    }
}

fun main(){
    val sol = Solution5()
    sol.combinationSum3(3,9)
}