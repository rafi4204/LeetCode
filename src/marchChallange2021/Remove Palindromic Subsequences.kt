package marchChallange2021

class Solution7 {
    fun removePalindromeSub(s: String): Int {
      if(s.isEmpty())
          return 0
        return if(s.reversed() == s)
            1
        else
            2
    }
}