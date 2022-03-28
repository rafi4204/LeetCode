package codeforces

fun main() {
    val scan = java.util.Scanner(System.`in`)
    var t = scan.nextLine().toInt()


    while (t > 0) {
        t--
        val nn = scan.nextLine().split(" ")
        var m = nn[1].toInt()
        val n = nn[0].toInt()
        val map = hashMapOf<Int, Int>()
        var root = 0
        while (m > 0) {
            m--
            val aa = scan.nextLine().split(" ")
            val b = aa[1].toInt()
            map[b] = 1

        }
        for(i in 1..n)
            if(map[i]==null) {
                root = i
                break
            }
        for(i in 1..n){
            if(i != root)
            println("$i $root")
        }
    }
}