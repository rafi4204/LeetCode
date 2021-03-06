package contest

class Solution5 {

    fun nearestValidPoint(x: Int, y: Int, points: Array<IntArray>): Int {
        val list = arrayListOf<Pair<Int, Int>>()
        var i = 0
        points.forEach {
            if (x == it[0] || y == it[1]) {
                list.add(Pair(i, Math.abs(x - it[0]) + Math.abs(y - it[1])))
            }
            i++
        }

        if (list.isNotEmpty())
            list.sortWith(object : Comparator<Pair<Int, Int>> {
                override fun compare(o1: Pair<Int, Int>, o2: Pair<Int, Int>): Int {
                    return if (o1.second != o2.second)
                        o1.second.compareTo(o2.second)
                    else
                        o1.first.compareTo(o2.first)
                }

            })
        else
            return -1
        return list[0].first
    }
}