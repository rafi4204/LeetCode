package marchChallange2021

class Solution9 {
    fun intToRoman(num: Int): String {
        val map = hashMapOf<Int, String>()
        map[1] = "I"
        map[2] = "II"
        map[3] = "III"
        map[4] = "IV"
        map[5] = "V"
        map[6] = "VI"
        map[7] = "VII"
        map[8] = "VIII"
        map[9] = "IX"
        map[10] = "X"
        map[50] = "L"
        map[100] = "C"
        map[500] = "D"
        map[1000] = "M"
        map[40] = "XL"
        map[90] = "XC"
        map[400] = "CD"
        map[900] = "CM"
        val temp = map.toSortedMap(object : Comparator<Int> {
            override fun compare(o1: Int, o2: Int): Int {
                return o2.compareTo(o1)
            }

        })
        var n = num
        var res = ""
        temp.forEach {
            while (n >= it.key) {
                res += map[it.key]
                n -= it.key
            }

        }
        return res

    }
}