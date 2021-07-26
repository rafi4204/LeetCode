package codeforces

import sun.misc.Queue
import sun.security.provider.Sun

fun main() {

    val scan = java.util.Scanner(System.`in`)
    //val s = scan.nextLine().toString()
    var tt = scan.nextLine().toInt()

    while (tt > 0) {
        tt--
        val n = scan.nextLine().toInt()
        val mat = Array(n) { IntArray(5) { 0 } }

        for (i in 0 until n) {
            var s = scan.nextLine().split(" ")
            for (j in 0..4) {
                mat[i][j] = s[j].toInt()
            }
        }

        var list = ArrayList<Pair<Int, Int>>()
        var mn = Int.MAX_VALUE
        var indx = -1


        for (j in 0 until 5) {
            mn = Int.MAX_VALUE
            indx = -1

            for (i in 0 until n) {
                if (mat[i][j] < mn) {
                    mn = mat[i][j]
                    indx = i
                }
            }
            list.add(Pair(mn, indx))


        }
        val map = hashMapOf<Int, Int>()
        list.forEach {
            if (map[it.second] != null)
               map[it.second] = map[it.second]!! + 1
            else
                map[it.second] = 1
        }

        map.toSortedMap()

        if (map.values.first() >= 3)
            println(map.keys.first())
        else
            println(-1)

    }
}

fun List<String>.toInt(): MutableList<Int> {
    val a = mutableListOf<Int>()
    this.forEach {
        a.add(it.toInt())
    }
    return a
}
