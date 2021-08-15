package februaryChallange2021

import java.lang.StringBuilder
import kotlin.math.floor

class Solution17 {
   /* val result = mutableListOf<String>()
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
    }*/


    fun letterCasePermutation(s: String): List<String> {
        val res = ArrayList<String>()
        val n = Math.pow(2.0, s.length.toDouble()).toInt()
        val map = hashMapOf<String, Int>()
        for (i in 0..n) {
            val temp = arrayListOf<Char>()
            for (j in s.indices) {
                if ((s[j] in 'a'..'z' ||s[j] in 'A'..'Z')&&i.and(1.shl(j))==1.shl(j)) {
                    if(s[j] in 'a'..'z')
                        temp.add(s[j]-32)
                    else
                        temp.add(s[j]+32)
                }
                else
                    temp.add(s[j])
            }
            if (map[temp.joinToString("")] == null)
                res.add(temp.joinToString(""))
            map[temp.joinToString("")] = 1
        }

        return res
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