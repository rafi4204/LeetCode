package aprilChallange2022

class Solution1 {
    fun validPalindrome(s: String): Boolean {
        var f = 0
        var l = s.length - 1
        var c = 0
        while (f <= l) {

            if (s[f] != s[l]) {
                return helper(s, f + 1, l) || helper(s, f, l - 1)
            } else {
                f++
                l--
            }

        }
        return true
    }

    private fun helper(s: String, i: Int, j: Int): Boolean {
        var f = 0
        var l = s.length - 1
        while (f <= l) {
            if (s[f] != s[l])
                return false
            f++
            l--
        }
        return true
    }


}