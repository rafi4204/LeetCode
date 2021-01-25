package dp

import java.lang.Integer.max

class Solution {
    fun longestPalindrome(s: String): String {
        var palindrom = ""
        var maxSize = -1001

        for (i in s.indices) {
            var j = i
            var k = i
            var eJ = i+1
            var ek = i
            var len = 0
            var temp = ""
            while (true) {
                if (k < 0 || j >= s.length || s[j] != s[k]) {
                    if (j-k+1 > maxSize) {
                        maxSize = j-k+1
                        palindrom = temp

                    }
                    break
                }else{
                    temp =s.substring(k,j+1)
                    j++
                    k--


                }
            }
            temp = ""
            while (true) {
                if (ek < 0 || eJ >= s.length || s[eJ] != s[ek]) {
                    if (eJ-ek+1 > maxSize) {
                        maxSize = eJ-ek+1
                        palindrom = temp

                    }
                    break
                }
                else{
                 temp = s.substring(ek,eJ+1)
                    eJ++
                    ek--
                }
            }

        }
        return palindrom
    }
}

fun main(){
    val solution = Solution()
    println(solution.longestPalindrome("babad"))
}