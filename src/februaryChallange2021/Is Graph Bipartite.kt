package februaryChallange2021

import sun.misc.Queue

class Solution15 {
    fun isBipartite(graph: Array<IntArray>): Boolean {
        val row = graph.size
        val color = IntArray(row) { 0 }
        val q = sun.misc.Queue<Int>()
        for(j in graph.indices){
            if(color[j]==0) {
                q.enqueue(j)
                color[j] = 1
            }
            while (!q.isEmpty) {
                val p = q.dequeue()
                for (i in graph[p].indices) {
                    if (color[graph[p][i]] == color[p]) {
                        return false
                    }
                    if (color[graph[p][i]] == 0) {
                        if (color[p] == 1)
                            color[graph[p][i]] = 2
                        else
                            color[graph[p][i]] = 1
                        q.enqueue(graph[p][i])
                    }
                }
            }
        }
        return true
    }
}