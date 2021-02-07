package februaryChallange2021

import java.util.*

class Solution5 {
    fun shortestToChar(s: String, c: Char): IntArray {
        val indexSet = TreeSet<Int>()
        val result = IntArray(s.length)
        s.forEachIndexed { index, cc ->
            if (cc == c)
                indexSet.add(index)
        }
        s.forEachIndexed { index, cc ->
            indexSet.add(index)
            val temp = indexSet.indexOf(index)
            when {
                cc == c -> result[index] = 0
                temp == 0 -> result[index] = indexSet.elementAt(temp!! + 1) - indexSet.elementAt(temp!!)
                temp == indexSet.size - 1 -> result[index] = indexSet.elementAt(temp!!) - indexSet.elementAt(temp!! - 1)
                else -> result[index] = Math.min(
                    Math.abs(indexSet.elementAt(temp!!) - indexSet.elementAt(temp!! + 1)),
                    Math.abs(indexSet.elementAt(temp!! - 1) - indexSet.elementAt(temp!!))
                )
            }
            if(cc!=c)
            indexSet.remove(index)
        }
        result.forEach {
            print(it)
        }

        return result
    }
}
fun main(){
    val sol = Solution5()
    sol.shortestToChar("loveleetcode",'e')

}