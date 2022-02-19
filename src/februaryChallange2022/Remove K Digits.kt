package februaryChallange2022

import java.util.*

class Solution3 {
    fun removeKdigits(num: String, kk: Int): String {
        val stk = Stack<Char>()
        var k = kk
        if(k == num.length)
            return "0"
        var res = ""
        for (i in num.indices) {

            while (!stk.empty() && stk.peek() > num[i] && k > 0) {
                k--
                stk.pop()
            }
            stk.push(num[i])

        }
        while (!stk.empty() && k > 0) {
            stk.pop()
            k--
        }fun removeKdigits(num: String, kk: Int): String {
            val stk = Stack<Char>()
            var k = kk
            if(k == num.length)
                return "0"
            var res = ""
            for (i in num.indices) {

                while (!stk.empty() && stk.peek() > num[i] && k > 0) {
                    k--
                    stk.pop()
                }
                stk.push(num[i])

            }
            while (!stk.empty() && k > 0) {
                stk.pop()
                k--
            }
            if (stk.empty())
                return "0"
            while (!stk.empty()) {
                res += stk.pop()
            }
            res = res.reversed()
            var res2 =""
            for(i in res.indices){
                if(res[i]=='0')
                    if(i+1 in res.indices)
                        res2 = res.removeRange(0,i+1)
                if(res[i]!='0')
                    break
            }


            return if(res2.isEmpty())res else res2
        }
        if (stk.empty())
            return "0"
        while (!stk.empty()) {
            res += stk.pop()
        }
        res = res.reversed()
        var res2 =""
        for(i in res.indices){
            if(res[i]=='0')
                if(i+1 in res.indices)
                    res2 = res.removeRange(0,i+1)
            if(res[i]!='0')
                break
        }


        return if(res2.isEmpty())res else res2
    }
}