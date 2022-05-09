package random

class Solution44 {
    fun characterReplacement(s: String, k: Int): Int {
        var i = 0
        val map = hashMapOf<Char, Int>()
        var c = 0
        var mxF = 0
        var mxL = 0
        for (j in s.indices) {
            map[s[j]] = map.getOrDefault(s[j], 0) + 1
            mxF = mxF.coerceAtLeast(map[s[j]]!!)
            while (j - i + 1 - mxF > k) {
                map[s[i]] = map[s[i]]!! - 1
                i++
            }
            mxL = mxL.coerceAtLeast(j - i + 1)
        }
        return mxL
    }
}