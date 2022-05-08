package aprilChallange2021

import java.util.*

class Solution9 {
    fun removeDuplicates(s: String, k: Int): String {
        val stk = Stack<Pair<Char, Int>>()
        var res = arrayListOf<Char>()
        stk.push(Pair('#', 1))
        stk.push(Pair(s[0], 1))
        for (i in 1 until s.length) {
            stk.push(Pair(s[i], if (s[i] == stk.peek().first) stk.peek().second + 1 else 1))
            if (stk.peek().second == k) {
                for (j in 1..k)
                    stk.pop()

            }
        }

        for (i in 1 until stk.size) {
            res.add(stk[i].first)
        }
        return res.toCharArray().joinToString("")
    }


    /* fun removeDuplicates(s: String, k: Int): String {
         val stk = Stack<Pair<Char, Int>>()
         var res = ""
         stk.push(Pair('#',1))
         for (i in s.indices) {
             stk.push(Pair(s[i], if (stk.peek().first == s[i]) stk.peek().second + 1 else 1))
             if (stk.peek().second == k) {
                 for (j in 1..k)
                     stk.pop()
             }

         }
         stk.forEach {
             if(it.first !='#')
                 res += it.first
         }
         return res
     }*/





}