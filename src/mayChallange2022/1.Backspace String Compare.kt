package mayChallange2022

class Solution1 {
    fun backspaceCompare(s: String, t: String): Boolean {
        var c = 0
        var res1 = ""
        var res2 = ""
        for (i in s.length - 1 downTo 0) {
            if (s[i] == '#')
                c++
            else if (c == 0) {
                res1 += s[i]
            } else
                c--
        }
        c = 0
        for (i in t.length - 1 downTo 0) {
            if (t[i] == '#')
                c++
            else if (c == 0) {
                res2 += t[i]
            } else
                c--
        }
        return res1 == res2
    }
}