package julyChallange2021

import java.lang.StringBuilder

class Solution1 {
    fun grayCode(n: Int): List<Int> {
        val res = arrayListOf<String>()
        val str: StringBuilder = StringBuilder("")
        for (i in 1..n)
            str.append('0')
        var j = n - 1
        res.add(str.toString())
        for (k in 1..2) {
            j = n - 1
            for (i in 0 until n) {
                if (str[j] == '0')
                    str[j] = '1'
                else
                    str[j] = '0'
                j--
                res.add(str.toString())
                if (j < 0)
                    break
            }
        }
        return binaryToDecimal(res)
    }

    fun binaryToDecimal(res: ArrayList<String>): ArrayList<Int> {
        var j = 0
        var va = 0
        var list = arrayListOf<Int>()
        res.forEach {
            j = it.length - 1
            va = 0
            it.forEach {
                va += (it.toInt() - 48).shl(j)
                j--
            }
            list.add(va)

        }
        list.removeAt(list.size-1)
        return list
    }
}

fun main() {
    val sol = Solution1()
    sol.grayCode(2)
}