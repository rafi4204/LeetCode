package random

import java.util.*


class Solution43 {
    fun maxFreq(s: String, maxLetters: Int, minSize: Int, maxSize: Int): Int {
        var i = 0
        var uniqChar = 0
        var mx = 0
        val set = hashMapOf<Char, Int>()
        val map = hashMapOf<String, Int>()
        var j = 0
        while (j in s.indices) {
            set[s[j]] = set.getOrDefault(s[j], 0) + 1
            if (set[s[j]] == 1)
                uniqChar++
            while (j - i + 1 > minSize) {

                set[s[i]] = set[s[i]]!! - 1
                if (set[s[i]] == 0)
                    uniqChar--
                i++

            }
            if (uniqChar <= maxLetters)
                map[s.substring(i, j + 1)] = map.getOrDefault(s.substring(i, j + 1), 0) + 1
            j++
        }
        map.values.forEach {
            mx = mx.coerceAtLeast(it)
        }
        return mx
    }


}

fun main() {
    val sol = Solution43()
    sol.maxFreq("aababcaab", 2, 3, 4)
}