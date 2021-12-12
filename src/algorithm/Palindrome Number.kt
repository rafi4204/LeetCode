package algorithm

class Solution3 {
    fun isPalindrome(x: Int): Boolean {
        val str = x.toString()
        var i = 0
        var j = str.length - 1
        while (i <= j) {
            if (str[i] != str[j])
                return false
            i++
            j--
        }
        return true
    }
}