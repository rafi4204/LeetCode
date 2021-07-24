package julyChallange2021

class Solution4 {
    fun threeEqualParts(arr: IntArray): IntArray {
        var c = 0
        var f = 0
        var l = 0
        val res = IntArray(2) { -1 }
        arr.forEach {
            if (it == 1)
                c++
        }
        if (c % 3 == 0) {

            f = arr.indexOfFirst { it == 1 }
            l = arr.indexOfLast { it == 1 }

            res[0] = f
            res[1] = l
        }
        return res

    }
}