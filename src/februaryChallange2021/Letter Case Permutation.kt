package februaryChallange2021

import java.lang.StringBuilder
import kotlin.math.floor

class Solution17 {
    val result = mutableListOf<String>()
    fun letterCasePermutation(S: String): List<String> {
        stringGenerator("", S, 0)
        return result
    }

    private fun stringGenerator(cur: String, s: String, i: Int) {
        var s1 = cur
        if (s1.length == s.length) {
            result.add(s1)
            return
        }
        if (s[i] in 'a'..'z')
            stringGenerator(s1 + (s[i] - 32), s, i + 1)
        else if (s[i] in 'A'..'Z')
            stringGenerator(s1 + (s[i] + 32), s, i + 1)
        stringGenerator(s1 + s[i], s, i + 1)
    }
}

fun main() {
    var l =1
    var r = 3
var res =0
    while(l<r) {
       val mid = l+Math.floor((r-l) / 2.toDouble())
        if (mid * mid > 3)
            r = (mid - 1).toInt()
        else if (mid * mid < 3) {
            l = (mid + 1).toInt()
            res = mid.toInt()
        }
        else if(mid*mid == 3.0) {
           // return mid.toInt()

      }

    }
    print(res)
}