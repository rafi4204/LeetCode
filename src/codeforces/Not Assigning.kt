package codeforces

fun main() {
    val scan = java.util.Scanner(System.`in`)
    var t = scan.nextLine().toInt()


    while (t > 0) {
        t--
        val n = scan.nextLine().toInt()
        val edgList = arrayListOf<Pair<Int, Int>>()
        val edges : MutableList<ArrayList<Int>> = ArrayList()
        var ans = 0
        val vis = IntArray(n + 1) { -1 }
        val map = hashMapOf<Pair<Int,Int>,Int>()
        for(i in 0..n){
            edges.add(ArrayList())
        }
        for (i in 1 until n) {
            val nn = scan.nextLine().split(" ")
            edges[nn[0].toInt()].add(nn[1].toInt())
            edges[nn[1].toInt()].add(nn[0].toInt())
            edgList.add(Pair(nn[0].toInt(),nn[1].toInt()))
            if (edges[nn[0].toInt()].size >= 3 || edges[nn[1].toInt()].size >= 3)
                ans = -1
        }
        if (ans == -1) {
            println(ans)
            continue
        }
        dfs(1, vis, edges, 2,map)
        edgList.forEach {
            print("${map[it]} ")
        }
        println()

    }
}

fun dfs(i: Int, vis: IntArray, edges: MutableList<ArrayList<Int>>, cc: Int, map: HashMap<Pair<Int, Int>, Int>) {
    vis[i] = 1
    var c = cc
    for (j in edges[i].indices) {
        if (vis[edges[i][j]] == -1) {
            map.putIfAbsent(Pair(i,edges[i][j]),5 - c)
            map.putIfAbsent(Pair(edges[i][j],i),5 - c)
            dfs(edges[i][j], vis, edges, 5 - c, map)
            c = 5 - c
        }
    }

}
