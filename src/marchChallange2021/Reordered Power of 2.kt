package marchChallange2021

import java.lang.StringBuilder

class Solution16 {
    fun reorderedPowerOf2(N: Int): Boolean {
        var res = N.toString().toCharArray()
        var temp = res.sorted().joinToString("")

        for (i in 0 until 32) {
            if (temp == 1.shl(i).toString().toCharArray().sorted().joinToString(""))
                return true
        }
        return false
    }
}