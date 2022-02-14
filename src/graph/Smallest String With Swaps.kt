package graph

import java.util.PriorityQueue

class Solution2 {
    lateinit var root: IntArray
    lateinit var rank: IntArray
    fun smallestStringWithSwaps(s: String, pairs: List<List<Int>>): String {
        root = IntArray(s.length) { 0 }
        rank = IntArray(s.length) { 1 }

        for(i in s.indices)
            root[i] = i
        pairs.forEach {
            union(it[0], it[1])
        }
        val grpChar = hashMapOf<Int, PriorityQueue<Char>>()
        for (i in s.indices) {
            grpChar.putIfAbsent(find(i), PriorityQueue<Char>())
            grpChar[find(i)]?.add(s[i])
        }
        val str = StringBuilder()
        for (i in s.indices) {
            str.append(grpChar[find(i)]?.poll())
        }
        return str.toString()
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

fun main(){
    val sol = Solution2()
    sol.smallestStringWithSwaps("dcab", listOf(listOf(0,3), listOf(1,2)))
}