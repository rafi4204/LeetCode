package marchChallenge2022

class Solution2 {
    fun isSubsequence(s: String, t: String): Boolean {
        var i = 0
        var j = 0
        while (i < s.length) {
            while (s[i] != t[j])
                j++
            i++
            if (j >= t.length - 1)
                return false
        }
        return true
    }
}