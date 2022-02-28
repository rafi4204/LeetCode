package random

class Solution15 {
    // you need treat n as an unsigned value
    fun reverseBits(nn:Int):Int {
        var res = 0
        var n =nn
        for(i in 1..32){
            res = res.shl(1)
            res += (n and 1)
            n=n.shr(1)
        }
        return res
    }
}