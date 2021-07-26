package contest

class Solution17 {
    fun smallestChair(times: Array<IntArray>, targetFriend: Int): Int {
        val list = ArrayList<Pair<Pair<Int, Int>, Int>>()
        var i = 0
        var ans = 1
        times.forEach {
            list.add(Pair(Pair(it[0], it[1]), i++))
        }

        list.sortWith(object : Comparator<Pair<Pair<Int, Int>, Int>> {
            override fun compare(o1: Pair<Pair<Int, Int>, Int>, o2: Pair<Pair<Int, Int>, Int>): Int {
                return o1.first.first.compareTo(o2.first.first)
            }

        })
        var ar = IntArray(times.size) { -1 }

        list.forEach {
            for (j in ar.indices) {
                if (it.first.first >= ar[j]) {
                    ar[j] = it.first.second
                    if (it.second == targetFriend)
                        ans = j
                    break
                }

            }

        }
        return ans
    }
}

fun main() {
    val sol = Solution17()
    sol.smallestChair(arrayOf(intArrayOf(1, 4), intArrayOf(2, 3), intArrayOf(4, 6)), 1)
}