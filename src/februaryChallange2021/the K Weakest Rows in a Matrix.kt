package februaryChallange2021

import java.util.*
import kotlin.Comparator
import kotlin.math.roundToLong

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
var mn:Long = 999999999
fun main() {
    var t = Integer.valueOf(readLine())
    var cont = 1
    while (t-- > 0) {
        mn = 999999999
        var n = Integer.valueOf(readLine())
        val v = java.util.Vector<Pair<Long, Long>>()
        while (n-- > 0) {
            val ar = readLine()?.split(" ")
            v.addElement(Pair(ar!![0].toLong(), ar[1].toLong()))
        }
        v.sortWith(object : Comparator<Pair<Long, Long>> {
            override fun compare(o1: Pair<Long, Long>, o2: Pair<Long, Long>): Int {
                return o1.second.compareTo(o2.second)
            }
        })
        val y :Long = v.elementAt(v.size/2).second


        var resultY: Long = 0

        v.forEach {
            resultY +=  Math.abs(it.second - y)

        }
        v.sortWith(object : Comparator<Pair<Long, Long>> {
            override fun compare(o1: Pair<Long, Long>, o2: Pair<Long, Long>): Int {
                return o1.first.compareTo(o2.first)
            }
        })
        var l:Long = -2000000000L
        var r :Long = 2000000000L
        var mid:Long= 0
        while(l<=r){
            mid = (((l+r)/2).toLong())
            if(dist(mid+1,v) - dist(mid,v)>=0){
                r  = (mid-1)

            }else{
                l = (mid+1)
            }
        }

        print("Case #${cont++}: ")
        println(mn+resultY)

    }

}

fun dist(i: Long, v: java.util.Vector<Pair<Long, Long>>): Long {
    var resultX :Long = 0
    var j:Long =0
    v.forEach {
        resultX +=  Math.abs(-it.first + i+j)
        j++
    }
    mn = Math.min(resultX,mn)
    return resultX
}
