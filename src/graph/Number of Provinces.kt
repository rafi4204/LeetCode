package graph

class Solution {
    lateinit var root: IntArray
    lateinit var rank: IntArray
    var set = mutableSetOf<Int>()
    fun findCircleNum(isConnected: Array<IntArray>): Int {
        val n = isConnected.size
        root = IntArray(n) { 0 }
        rank = IntArray(n) { 1 }

        for (i in 0 until n)
            root[i] = i
        for (i in 0 until n)
            for (j in 0 until n) {
                if (isConnected[i][j] == 1)
                    union(i, j)
            }
        root.forEach {
            set.add(find(it))
        }
        return set.size
    }


    fun find(n: Int): Int {
        if (n == root[n])
            return n
        root[n] = find(root[n])
        return root[n]
    }



    fun union(a: Int, b: Int) {
        val rootA = find(a)
        val rootB = find(b)
        if (rootA != rootB) {
            if (rank[rootA] > rank[rootB])
                root[rootB] = rootA
            else if (rank[rootA] < rank[rootB])
                root[rootA] = rootB
            else {
                root[rootA] = rootB
                rank[rootB] += 1
            }

        }
    }
}