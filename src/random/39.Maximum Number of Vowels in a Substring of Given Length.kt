package random

class Solution39 {
    fun maxVowels(s: String, k: Int): Int {
        var i = 0
        var max = 0
        var c = 0
        for (j in s.indices) {
            if (s[j] == 'a' || s[j] == 'e' || s[j] == 'i' || s[j] == 'o' || s[j] == 'u')
                c++
            if (j - i + 1 == k) {
                max = max.coerceAtLeast(c)
                if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u')
                    c--
                i++
            }
        }
        return max
    }
}