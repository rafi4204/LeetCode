package twoPointers

class Solution5 {
    fun reverseString(s: CharArray): Unit {
        var l = 0
        var r = s.lastIndex
        while (l <= r) {
            val temp = s[l]
            s[l] = s[r]
            s[r] = temp
            l++
            r--
        }
    }
}