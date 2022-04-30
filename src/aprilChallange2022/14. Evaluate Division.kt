class Solution14 {
    fun calcEquation(equations: List<List<String>>, values: DoubleArray, queries: List<List<String>>): DoubleArray {
        val map = hashMapOf<String, HashMap<String, Double>>()
        buildGraph(map, equations, values)
        val res = DoubleArray(queries.size) { -1.00 }

        var i = 0
        queries.forEach {
            val visited = HashMap<String, Int>()
            val r = dfs(map, it[0], it[1], visited)
            if (r != null)
                res[i] = r
            i++

        }
        return res
    }

    private fun dfs(
        map: HashMap<String, HashMap<String, Double>>,
        q1: String,
        q2: String,
        visited: HashMap<String, Int>
    ): Double? {
        if (visited[q1] != null) return null
        if (map[q1] == null || map[q2] == null)
            return null
        if (map[q1] != null && map[q1]!![q2] != null)
            return map[q1]!![q2]

        val q1Val = map[q1]
        visited[q1] = 1
        q1Val?.keys?.forEach {
            val d = dfs(map, it, q2, visited)
            if (d != null)
                return d * q1Val[it]!!
        }
        return null

    }

    private fun buildGraph(
        map: java.util.HashMap<String, java.util.HashMap<String, Double>>,
        equations: List<List<String>>,
        values: DoubleArray
    ) {
        for (i in equations.indices) {
            if (!map.containsKey(equations[i][0]))
                map.put(equations[i][0], hashMapOf<String, Double>())
            map.get(equations[i][0])?.put(equations[i][1], values[i])
            if (!map.containsKey(equations[i][1]))
                map.put(equations[i][1], hashMapOf<String, Double>())
            map.get(equations[i][1])?.put(equations[i][0], 1 / values[i])
        }
    }
}

fun main() {
    val sol = Solution14()
    val eq = arrayListOf<ArrayList<String>>(arrayListOf("a", "b"), arrayListOf("b", "c"))
    val eq1 = arrayListOf<ArrayList<String>>(
        arrayListOf("a", "c"),
        arrayListOf("b", "a"),
        arrayListOf("a", "e"),
        arrayListOf("a", "a"),
        arrayListOf("x", "x")
    )
    sol.calcEquation(eq, doubleArrayOf(2.0, 3.0), eq1)
}