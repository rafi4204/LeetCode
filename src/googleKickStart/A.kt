package googleKickStart

import codeforces.dfs

fun main() {
    val scan = java.util.Scanner(System.`in`)
    var t = scan.nextLine().toInt()

    var i = 0;
    while (t > 0) {
        t--
        val n = scan.nextLine().split(" ")
        val r = n[0].toInt()
        val c = n[1].toInt()
        i++
        println("Case #$i:")
        for (j in 0..2 * r) {
            for (k in 0..2 * c) {
                if ((j == 0 || j == 1) && (k == 0 || k == 1))
                    print(".")
                else if (j % 2 == 0) {
                    if (k % 2 == 0)
                        print("+")
                    else
                        print("-")
                } else {
                    if (k % 2 == 0)
                        print("|")
                    else
                        print(".")
                }
            }
            println()
        }


    }
}