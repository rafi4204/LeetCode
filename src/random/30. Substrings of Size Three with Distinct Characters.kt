package random

import java.util.*

class Solution30 {
    fun countGoodSubstrings(s: String): Int {
        var i = 0
        var j = 0
        var ans = 0
        val set = TreeSet<Char>()
        while (i < s.length - 3) {
            set.add(s[j++])
            if (j == i + 3) {
                if (set.size == 3)
                    ans++
                set.clear()
                i++
                j = i
            }

        }
        return ans
    }
}