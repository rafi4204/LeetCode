package marchChallange2021

class Solution23 {
    fun maxEnvelopes(envelopes: Array<IntArray>): Int {
        val list = ArrayList<Pair<Int, Int>>()
        var res = 1
        envelopes.forEach {
            list.add(Pair(it[0], it[1]))
        }
        list.sortWith(object : Comparator<Pair<Int, Int>> {
            override fun compare(o1: Pair<Int, Int>, o2: Pair<Int, Int>): Int {
                return o1.first.compareTo(o2.first)
            }
        })
        var temp = list[0]
        for (i in 1 until list.size) {
            if (temp.first < list[i].first && temp.second < list[i].second) {
                temp = list[i]
                res++
            }
        }
        return res
    }
}