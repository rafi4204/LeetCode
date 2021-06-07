package juneChallange2021

import sun.misc.Queue
import sun.security.provider.Sun
import java.util.*


class Solution4 {
    fun openLock(deadends: Array<String>, target: String): Int {
        var mn = Int.MAX_VALUE
        val vis = hashMapOf<String, Int>()
        val map = hashMapOf<String, Int>()
        deadends.forEach {
            map[it] = 1
        }
        val root = Tree(0, 0, 0, 0, 0)
        makeTree(root)
        val q = sun.misc.Queue<Tree>()
        q.enqueue(root)
        while (!q.isEmpty) {
            val node = q.dequeue()

            if (stringValue(node) == target) {
                mn = Math.min(node.level, mn)
            }
            vis[stringValue(node)] = 1

            if (node.first != null && map[stringValue(node.first!!)] == null&&vis[stringValue(node.first!!)] == null)
                q.enqueue(node.first)
            if (node.second != null && map[stringValue(node.second!!)] == null&&vis[stringValue(node.second!!)] == null)
                q.enqueue(node.second)
            if (node.third != null && map[stringValue(node.third!!)] == null&&vis[stringValue(node.third!!)] == null)
                q.enqueue(node.third)
            if (node.fourth != null && map[stringValue(node.fourth!!)] == null&&vis[stringValue(node.fourth!!)] == null)
                q.enqueue(node.fourth)

        }
        return mn
    }

    private fun stringValue(tree: Tree): String {
        return tree.i.toString() + tree.i1.toString() + tree.i2.toString() + tree.i3.toString()

    }


    private fun makeTree(tree: Tree?) {
        if (tree?.i == 9 && tree.i1 == 9 && tree.i2 == 9 && tree.i3 == 9)
            return

        if (tree?.i?.plus(1)!! < 10) {
            tree.first = Tree(tree.i + 1, tree.i1, tree.i2, tree.i3, tree.level + 1)
            makeTree(tree.first)
        }
        if (tree.i1 + 1 < 10) {
            tree.second = Tree(tree.i, tree.i1 + 1, tree.i2, tree.i3, tree.level + 1)
            makeTree(tree.second)
        }
        if (tree.i2 + 1 < 10) {
            tree.third = Tree(tree.i, tree.i1, tree.i2 + 1, tree.i3, tree.level + 1)
            makeTree(tree.third)
        }
        if (tree.i3 + 1 < 10) {
            tree.fourth = Tree(tree.i, tree.i1, tree.i2, tree.i3 + 1, tree.level + 1)
            makeTree(tree.fourth)
        }

    }

    inner class Tree(val i: Int, val i1: Int, val i2: Int, val i3: Int, val level: Int) {
        var first: Tree? = null
        var second: Tree? = null
        var third: Tree? = null
        var fourth: Tree? = null
    }
}