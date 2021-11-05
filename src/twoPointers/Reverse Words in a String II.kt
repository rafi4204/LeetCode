package twoPointers

class Solution6 {
    fun reverseWords(s: String): String {
        var fast = 0
        var slow = 0
        var ss = StringBuilder(s)
        while (fast <= ss.length) {
            if (fast == ss.length || ss[fast] == ' ') {
                reverse(ss, fast, slow)
                slow = fast + 1
            }
            fast++
        }
        return ss.toString()
    }

    private fun reverse(s: StringBuilder, fast: Int, slow: Int) {
        var i = slow
        var j = fast - 1
        while (i < j) {
            val temp = s[i]
            s[i] = s[j]
            s[j] = temp
            i++
            j--
        }
    }
}

fun main(){
    val sol = Solution6()
    sol.reverseWords("Let's take LeetCode contest")
}