package twoPointers

class Solution13 {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty())
            return 0
        if(needle.length>haystack.length)
            return -1
        for (i in 0 until haystack.length-needle.length +1) {
            var j = 0
            while (j in needle.indices) {
                if (haystack[i + j] != needle[j])
                    break
                j++
            }
            if (j == needle.length)
                return i
        }
        return -1
    }
}