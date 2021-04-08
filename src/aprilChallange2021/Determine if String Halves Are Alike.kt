package aprilChallange2021

class Solution3 {
    fun halvesAreAlike(s: String) =
         s.substring(0, s.length / 2).count { "aeiouAEIOU".contains(it) } == s.substring(s.length / 2, s.length)
            .count { "aeiouAEIOU".contains(it) }
}