package februaryChallange2022

class Solution6 {
    fun titleToNumber(columnTitle: String): Int {
        var res = 0
        var base = 1
        for (i in columnTitle.length - 1 downTo 0) {
            res += base * (columnTitle[i] - 'A'+1)
            base *= 26
        }
        return res
    }
}

fun main() {
    val sol = Solution6()
    sol.titleToNumber("AB")
}