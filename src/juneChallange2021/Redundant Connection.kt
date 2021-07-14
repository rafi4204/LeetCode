package juneChallange2021

class Solution8 {
    fun findRedundantConnection(edges: Array<IntArray>): IntArray {
        val map = hashMapOf<Int, Int>()
        var result = intArrayOf()

        edges.forEach {
            if (map[it[0]] != null && map[it[1]] != null)
                result = it
            else {
                map[it[0]] = 1
                map[it[1]] = 1
            }
        }

        return result
    }
}