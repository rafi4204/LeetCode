package februaryChallange2021

import java.util.Collections.sort

class Solution11 {
    fun isAnagram(s: String, t: String): Boolean {
        var result = false
        result = if(s.length != t.length)
            false
        else{
            s.toCharArray().sorted().toString()==t.toCharArray().sorted().toString()
        }
        return result
    }
}

fun main() {
    val sol = Solution11()
    sol.isAnagram(
        "anagram",
        "nagaram"
    )
}