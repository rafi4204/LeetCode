package random

class Solution16 {
    // you need treat n as an unsigned value
    fun hammingWeight(nn:Int):Int {
        var c = 0
        var n =nn
        for(i in 0..31){
            if(n and 1 == 1)
                c++
            n = n.shr(1)
        }
        return c
    }
}