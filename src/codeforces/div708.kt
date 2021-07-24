package codeforces

import sun.misc.Queue
import sun.security.provider.Sun

fun main() {

    val scan = java.util.Scanner(System.`in`)
    //val s = scan.nextLine().toString()
    var tt = scan.nextLine().toInt()

    while (tt > 0) {
        tt--
        val kk = scan.nextLine().split(" ")
        val ss = scan.nextLine().split(" ")
        var s = arrayListOf<Int>()
        var k = arrayListOf<Int>()
        ss.forEach {
            s.add(it.toInt())
        }
        kk.forEach {
            k.add(it.toInt())
        }
        val map = hashMapOf<Int, Int>()
        var c = 0
        s.forEach {
            if (map[it] == null || map[it]!! < k[1]) {
                if (map[it] == null)
                    map[it] = 1
                else
                    map[it] = map[it]!! + 1
                c++
            }
        }
        println(c / k[1])


    }
}

fun List<String>.toInt(): MutableList<Int> {
    val a = mutableListOf<Int>()
    this.forEach {
        a.add(it.toInt())
    }
    return a
}
