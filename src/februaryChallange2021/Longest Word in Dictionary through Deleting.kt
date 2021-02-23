package februaryChallange2021

class Solution23 {
    fun findLongestWord(s: String, d: List<String>): String {
        val list = arrayListOf<Pair<Int, String>>()
        var result = ""
        d.forEach {
            list.add(Pair(it.length, it))
        }
        list.sortWith(object : Comparator<Pair<Int, String>> {
            override fun compare(o1: Pair<Int, String>, o2: Pair<Int, String>): Int {
                return if (o1.first != o2.first) o2.first.compareTo(o1.first)
                else o1.second.compareTo(o2.second)
            }

        })
        list.forEach {
            if (isLcs(s,  it.second) ) {
                result = it.second
                return result
            }
        }

        return result

    }

    private fun isLcs(s1: String, s2: String): Boolean {
       var i = 0
        var j =0
        while(i<s1.length && j< s2.length){
            if(s1[i] == s2[j])
                j++
            i++
        }
        return j==s2.length
    }


    fun lcs(s1: String, s2: String): String {
        val dp = Array(s1.length) { IntArray(s2.length) { 0 } }
        var result = ""

        for (i in 1 until s1.length) {
            for (j in 1 until s2.length) {
                if (s1[i] == s2[j]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1

                } else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1])
            }

        }
        var i = s1.length - 1
        var j = s2.length - 1
        while (i > 0 && j > 0) {
            if (s1[i] == s2[j]) {
                result = s1[i] + result
                i--
                j--
            } else if (dp[i][j - 1] > dp[i - 1][j])
                j--
            else
                i--

        }

        return result
    }
}

fun main() {
    val sol = Solution23()
    print(sol.findLongestWord("abpcplea", arrayListOf("ale", "apple", "monkey", "plea")))
}