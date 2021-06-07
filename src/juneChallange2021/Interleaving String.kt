package juneChallange2021

class Solution2 {
    fun isInterleave(s1: String, s2: String, s3: String): Boolean {
        var s = s3
        var i = 0
        var j = 0
        if (s3.length != s1.length + s2.length)
            return false
        while (i in s3.indices && j in s1.indices) {
            if (s3[i] == s1[j]) {
                s = s.replaceRange(i, i+1, "#")
                j++
            }
            i++
        }
        if (j != s1.length)
            return false
        return s2 == s.replace("#", "")
    }
}
fun main(){
    val sol = Solution2()
    sol.isInterleave("aabcc",
        "dbbca",
        "aadbbcbcac")
}