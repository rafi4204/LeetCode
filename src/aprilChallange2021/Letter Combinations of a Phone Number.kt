package aprilChallange2021

import numSubarrayProductLessThanK

class Solution4 {
    fun letterCombinations(digits: String): List<String> {
        val map = hashMapOf<Int, String>()
        val res = arrayListOf<String>()
        var s = ""
        if (digits == "")
            return res
        map[2] = "abc"
        map[3] = "def"
        map[4] = "ghi"
        map[5] = "jkl"
        map[6] = "mno"
        map[7] = "pqrs"
        map[8] = "tuv"
        map[9] = "wxyz"
        rec(digits, s, 0, res, map)

        return res
    }

    private fun rec(digits: String, s: String, i: Int, res: ArrayList<String>, map: HashMap<Int, String>) {
        if (s.length == digits.length) {
            res.add(s)
            return
        }

        for (j in map[digits[i] - '0']!!.indices) {
            rec(digits, s + map[digits[i] - '0']!![j], i + 1, res, map)
        }

    }
}

fun main() {
    val sol = Solution4()
    sol.letterCombinations("23")
}