package codeforces

fun main() {

    val scan = java.util.Scanner(System.`in`)
    //val s = scan.nextLine().toString()
    var tt = scan.nextLine().toInt()

    while (tt > 0) {
        tt--
        val n = scan.nextLine().toInt()
        val s = scan.nextLine().split(" ")
        val ar = arrayListOf<Long>()
        s.forEach {
            ar.add(it.toLong())
        }
        var mx = Long.MIN_VALUE
        var prv = ar[0]
        for (i in 1 until n) {
            if (prv * ar[i] > mx)
                mx = prv * ar[i]

            prv = ar[i]
        }

        println(mx)

    }
}

fun List<String>.toInt(): MutableList<Int> {
    val a = mutableListOf<Int>()
    this.forEach {
        a.add(it.toInt())
    }
    return a
}
