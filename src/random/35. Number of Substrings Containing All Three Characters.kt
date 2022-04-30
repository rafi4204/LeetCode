package random

class Solution35 {
    fun numberOfSubstrings(s: String): Int {
        var i = 0
        var c = 0
        val map = hashMapOf<Char, Int>()
        map['a'] = 0
        map['b'] = 0
        map['c'] = 0
        for (j in s.indices) {
            map[s[j]] = map.getOrDefault(s[j], 0) + 1
            while (map['a']!! > 0 && map['b']!! > 0 && map['c']!! > 0 && i<=j) {
                c += s.length - j
                map[s[i]] = map[s[i]]!! - 1
                i++
            }

        }
        return c
    }
}