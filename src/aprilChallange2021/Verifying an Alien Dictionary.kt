package aprilChallange2021

class Solution5 {
    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        val map = hashMapOf<Char, Int>()
        val ar = arrayListOf<String>()
        for (i in order.indices) {
            map[order[i]] = i
        }
        words.forEach {
            val temp = arrayListOf<Char>()
            for (i in it.indices) {
                temp.add(map[it[i]]!!.toChar())
            }
            ar.add(temp.toArray().joinToString(""))
        }

        var prv = ar.get(0)
        for (i in 1 until ar.size) {
            if (prv > ar[i])
                return false
            prv = ar[i]
        }
        return true
    }
}