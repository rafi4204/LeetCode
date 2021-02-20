package februaryChallange2021

import java.lang.StringBuilder
import java.util.*

class Solution20 {
    fun minRemoveToMakeValid(ss: String): String {
        var open = 0
        var closed = 0
        val op = PriorityQueue<Int>()
        val clo = PriorityQueue<Int>()
        var s = StringBuilder(ss)
        var i =0
        while(i < s.length) {
            if (s[i] == ')') {
                if(op.isEmpty()) {
                    s.deleteCharAt(i)
                    i--
                }
                else
                    op.poll()

            } else if (s[i] == '(') {
                op.add(i)

            }
            i++
        }

        if(op.isNotEmpty()){

            while(op.isNotEmpty()){
                val l = op.poll()
               s.replace(l,l+1," ")
            }
        }

        return s.toString().replace("\\s+".toRegex(), "")

    }
}

fun main() {
    val sol = Solution20()
    print(sol.minRemoveToMakeValid("())()((("))
}