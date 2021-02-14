package februaryChallange2021

import java.util.*
import kotlin.Comparator

class Solution14 {
    fun numberOfSteps(num: Int): Int {
        var temp = num
        var count = 0
        while (temp > 0) {
            if (temp % 2 == 0)
                temp = temp / 2
            else
                temp--
            count++
        }
        return count
    }
}

fun main() {
    var t = Integer.valueOf(readLine())
    var cont = 1
    while (t-- > 0) {
        var n = Integer.valueOf(readLine())
        val v = Vector<Pair<Long, Long>>()
        while (n-- > 0) {
            val ar = readLine()?.split(" ")
            v.addElement(Pair(ar!![0].toLong(), ar[1].toLong()))
        }
        v.sortedWith(object : Comparator<Pair<Long, Long>> {
            override fun compare(o1: Pair<Long, Long>, o2: Pair<Long, Long>): Int {
                return o1.second.compareTo(o2.second)
            }
        })
        val y  = v.elementAt(v.size/2).second
        v.sortedWith(object : Comparator<Pair<Long, Long>> {
            override fun compare(o1: Pair<Long, Long>, o2: Pair<Long, Long>): Int {
                return o1.first.compareTo(o2.first)
            }
        })
        val x = v.first().first
        var result: Long = 0
        var i = 0
        v.forEach {
            result += Math.abs(it.first - x-i) + Math.abs(it.second - y)
            i++
        }
        print("Case #${cont++}: ")
        println(result)

    }

}