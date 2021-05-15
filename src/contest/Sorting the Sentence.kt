package contest

class Solution12 {
    fun sortSentence(s: String): String {
        var list = s.split(" ")
        val ar = Array<String>(list.size) { "0" }
        list.forEach {
            ar[it.last().toInt()- 48-1] = it.removeRange(it.lastIndex, it.length)
        }
        val res = ar.joinToString("")
        return res
    }
}
fun main(){
    val sol = Solution12()
    sol.sortSentence("is2 sentence4 This1 a3")
}