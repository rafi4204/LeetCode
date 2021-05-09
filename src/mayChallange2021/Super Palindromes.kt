package mayChallange2021

class Solution5 {
    fun superpalindromesInRange(left: String, right: String): Int {
        val list = arrayListOf<Long>()
        var temp = ""

        var res = 0
        for (i in 1..10000) {
            if (i < 10)
                list.add(i.toLong())
            temp = i.toString() + i.toString().reversed()
            list.add(temp.toLong())
            for (j in 0..9) {
                temp = i.toString() + j.toString() + i.toString().reversed()
                list.add(temp.toLong())
            }
        }
        val l = left.toLong()
        val r = right.toLong()
        list.forEach {
            val num = it * it
            if (it < 1e9 && num in l..r) {
                if (isPalindrom(num.toString()))
                    res++
            }
        }

        return res
    }

    private fun isPalindrom(s: String): Boolean {
        for (i in 0 until s.length / 2) {
            if (s[i] != s[s.length - i - 1])
                return false
        }
        return true
    }
}

fun main() {
    val sol = Solution5()
    sol.superpalindromesInRange(
        "4",
        "1000"
    )
}