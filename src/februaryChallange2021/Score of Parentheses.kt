package februaryChallange2021

class Solution25 {
    fun scoreOfParentheses(S: String): Int {
        var depth = 0
        var ans = 0
        var i = 0
        while(i in 0..S.length-1){
            if(i+1  in S.indices && S.substring(i,i+2) == "()" ) {
                ans += 1.shl(depth)
                i++
            }
            else if(S[i] == '(') depth++
            else depth--
            i++
        }
        return ans
    }
}
fun main(){
    val sol = Solution25()
    sol.scoreOfParentheses("()")
}