package mayChallange2021

class Solution9 {
    fun isNumber(s: String): Boolean {
        val regex = Regex(
            pattern = "^[+-]?([0-9]+|([0-9]*[.][0-9]+)|([0-9]+[.][0-9]*))([e|E][+-]?[0-9]+)?\$"

        )
        return regex.matches(s)
    }
}

fun main(){
    val sol = Solution9()
   println( sol.isNumber("01"))
}