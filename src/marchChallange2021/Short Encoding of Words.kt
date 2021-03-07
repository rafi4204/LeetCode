package marchChallange2021

class Solution6 {
    fun minimumLengthEncoding(words: Array<String>): Int {
       var res = ""
        words.sortWith(object:Comparator<String>{
            override fun compare(o1: String, o2: String): Int {
               return o2.length.compareTo(o1.length)
            }

        })
        res+=words[0]+"#"
        words.forEach {
            if(!res.contains(it+"#"))
                res+=it+"#"
        }
        return res.length
    }
}

fun main(){
    val sol = Solution6()
    sol.minimumLengthEncoding(arrayOf("time", "atime", "btime"))
}