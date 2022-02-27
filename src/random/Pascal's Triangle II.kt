package random

import java.util.Vector

class Solution14 {
    fun getRow(rowIndex: Int): List<Int> {
        val v = ArrayList<ArrayList<Int>>(rowIndex)
         if(rowIndex == 0) return listOf(1)
        for (i in 0..rowIndex) {
            val list = arrayListOf<Int>()
            list.add(1)
            for (j in 1 until i) {
                list.add(v[i - 1][j] + v[i - 1][j - 1])
            }

            list.add(1)
            v.add(list)
        }
        return v[rowIndex]
    }
}