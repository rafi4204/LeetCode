package contest

class Solution2 {
    fun longestNiceSubstring(s: String): String {
        var best = ""
        for (i in s.indices)
            for (j in i + 1..s.length) {
                if (isNice(s.substring(i, j)) && j - i > best.length)
                    best = s.substring(i, j)
            }
        return best
    }

    fun isNice(s: String): Boolean {
        s.forEach {
            if (it in 'a'..'z' && s.indexOf(it.toUpperCase(), 0, false) == -1)
                return false
            else if (it in 'A'..'Z' && s.indexOf(it.toLowerCase(), 0, false) == -1)
                return false

        }
        return true

    }
}