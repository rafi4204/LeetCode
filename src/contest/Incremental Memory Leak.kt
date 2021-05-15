package contest

class Solution13 {
    fun memLeak(memory1: Int, memory2: Int): IntArray {
        var mem1 = memory1
        var mem2 = memory2
        var i = 1
        while (mem1 >= i || mem2 >= i) {
            if (mem1 >= mem2)
                mem1 -=  i
            else
                mem2 -= i
            i++

        }
        return intArrayOf(i, mem1, mem2)
    }
}