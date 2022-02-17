package random

class Solution3 {
    fun addBinary(a: String, b: String): String {
       var carry = 0
        var sum = 0
        var i = a.length-1
        var j = b.length-1
        var res = StringBuilder()
        while(i>=0 || j>=0){
            sum = carry
            if(i>=0)
            sum+= a[i]-'0'
            if(j>=0)
            sum+= b[j]-'0'
            res.append(sum%2)
            carry = sum/2
            i--
            j--
        }
        if(carry!=0)
            res.append(carry)
        return res.reverse().toString()
    }
}