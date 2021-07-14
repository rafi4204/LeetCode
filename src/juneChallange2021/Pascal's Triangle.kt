package juneChallange2021

import java.util.*
import kotlin.collections.ArrayList

class Solution7 {
    fun generate(numRows: Int): List<List<Int>> {

        val list = Vector<Vector<Int>>(numRows)
        for(i in 0 until numRows)
            list.addElement(Vector<Int>(i+1))
        list[0].add(1)
        for (i in 1 until numRows) {
            list[i].add(0, 1)

            for (j in 1 until i ) {
                list[i].add(j,list[i - 1][j] + list[i - 1][j - 1])
            }
            list[i].add(i , 1)
        }
        return list
    }
}
fun main(){
    val sol = Solution7()
    sol.generate(5)
}