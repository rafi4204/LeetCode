package augestChallange2021

import sun.misc.Queue
import java.util.*


class Node(var `val`: Int) {
    var children: List<Node?> = listOf()
}


class Solution5 {
    fun levelOrder(root: Node?): List<List<Int>> {
        val res = arrayListOf<ArrayList<Int>>()
        val q = LinkedList<Node>()
        if (root != null) {
            q.add(root)
        }

        while (q.isNotEmpty()) {
            val size = q.size - 1
            val list = arrayListOf<Int>()
            for (i in 0..size) {
                val temp = q.removeFirst()
                list.add(temp.`val`)
                temp.children.forEach {
                    if (it != null) {
                        q.add(it)
                    }
                }
            }
            res.add(list)
        }

        return res

    }


}