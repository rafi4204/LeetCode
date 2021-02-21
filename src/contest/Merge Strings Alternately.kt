package contest

class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var res = ""
        var i = 0
        var j = 0
        while (i < word1.length || j < word2.length) {
            if (i < word1.length)
                res += word1[i]
            if (j < word2.length)
                res += word2[j]
            i++
            j++
        }
        return res
    }
}