package februaryChallange2021

class Solution16 {
    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        val ar = arrayListOf<Pair<Int, Int>>()
        val result = IntArray(k)
        var i = 0
        mat.forEach { it1 ->
            ar.add(Pair(i, it1.filter { it == 1 }.size))
            i++
        }
        ar.sortWith(object : Comparator<Pair<Int, Int>> {
            override fun compare(o1: Pair<Int, Int>, o2: Pair<Int, Int>): Int {
                return when {
                    o1.second != o2.second -> o1.second.compareTo(o2.second)
                    else -> o1.first.compareTo(o2.first)
                }
            }

        })
        for (j in 0 until k) {
            result[j] = ar[j].first
        }
        return result
    }
}