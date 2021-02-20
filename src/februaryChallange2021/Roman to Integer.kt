package februaryChallange2021

class Solution21 {
    fun romanToInt(s: String): Int {
        val map = hashMapOf<String, Int>()
        val map2 = hashMapOf<String, Int>()
        map["I"] = 1
        map["V"] = 5
        map["X"] = 10
        map["L"] = 50
        map["C"] = 100
        map["D"] = 500
        map["M"] = 1000
        map2["IV"] = 4
        map2["IX"] = 9
        map2["XL"] = 40
        map2["XC"] = 90
        map2["CD"] = 400
        map2["CM"] = 900
        var result = 0
        var i = 0
        while (i < s.length) {
            if (i + 1 < s.length && map2.containsKey(s.substring(i, i + 2))) {
                result += map2[s.substring(i, i + 1)]!!
                i++
            } else {
                result += map[s.substring(i, i + 1)]!!
            }
            i++
        }
        return result
    }
}