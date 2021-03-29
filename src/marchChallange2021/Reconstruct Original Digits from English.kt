package marchChallange2021

class Solution22 {
    fun originalDigits(s: String): String {

        val ar3 = IntArray(10) { 0 }

        val map2 = hashMapOf<Int, Int>()
        var res = ""
        s.forEach {
            if (map2[it - 'a'] == null)
                map2[it - 'a'] = 1
            else
                map2[it - 'a'] = map2[it - 'a']!! + 1
        }
        ar3[0] = if (map2['z' - 'a'] == null) 0 else map2['z' - 'a']!!
        ar3[4] = if (map2['u' - 'a'] == null) 0 else map2['u' - 'a']!!
        ar3[6] = if (map2['x' - 'a'] == null) 0 else map2['x' - 'a']!!
        ar3[8] = if (map2['g' - 'a'] == null) 0 else map2['g' - 'a']!!
        ar3[7] = if (map2['s' - 'a'] == null) 0 else map2['s' - 'a']!! - ar3[6]
        ar3[5] = if (map2['v' - 'a'] == null) 0 else map2['v' - 'a']!! - ar3[7]
        ar3[3] = if (map2['r' - 'a'] == null) 0 else map2['r' - 'a']!! - ar3[4] - ar3[0]
        ar3[2] = if (map2['t' - 'a'] == null) 0 else map2['t' - 'a']!! - ar3[3] - ar3[8]
        ar3[1] = if (map2['o' - 'a'] == null) 0 else map2['o' - 'a']!! - ar3[0] - ar3[2] - ar3[4]
        ar3[9] = if (map2['i' - 'a'] == null) 0 else map2['i' - 'a']!! - ar3[5] - ar3[6] - ar3[8]

        for (i in ar3.indices) {
            for (j in 1..ar3[i])
                res += i.toString()
        }
        return res

    }
}

fun main() {
    val sol = Solution22()
    sol.originalDigits("owoztneoer")
}