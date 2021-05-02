package contest

class Solution10 {
    fun replaceDigits(s: String): String {
        var res = ""
        for(i in s.indices) {
            res += if (i % 2 != 0)
                s[i - 1] + (s[i].toInt()-'0'.toInt())
            else
                s[i]
        }
        return  res

    }
}
fun main(){
    val sol = Solution10()
    sol.replaceDigits("a1c1e1")
}