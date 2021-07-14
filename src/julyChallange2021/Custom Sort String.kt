package julyChallange2021

class Solution2 {
    fun customSortString(order: String, str: String): String {
        val count = hashMapOf<Char, Int>()
        val count2 = hashMapOf<Char, Int>()
        var res = ""
        str.forEach {
            if (count[it] != null)
                count[it] = count[it]!! + 1
            else
                count[it] = 1

        }
        order.forEach {
            if (count2[it] != null)
                count2[it] = count2[it]!! + 1
            else
                count2[it] = 1
            if (count[it] != null )
                for (i in 1..count[it]!!)
                    res += it

        }
        str.forEach {
            if (count2[it] == null) {
                res += it
            }
        }
        return res
    }
}