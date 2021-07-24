package contest

class Solution16 {
    fun areOccurrencesEqual(s: String): Boolean {
        val map = hashMapOf<Char, Int>()
        s.forEach {
            if (map[it] == null)
                map[it] = 1
            else
                map[it] = map[it]!! + 1
        }

        var list = map.values

        var prv = list.first()
        list.forEach {
            if (prv != it)
                return false
            prv = it
        }

        return true


    }
}