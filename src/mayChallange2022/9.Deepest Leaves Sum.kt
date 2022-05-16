package mayChallange2022

import februaryChallange2021.TreeNode
import java.util.*

class Solution9 {
    fun deepestLeavesSum(root: TreeNode?): Int {
        val q = LinkedList<TreeNode?>()
        val map = hashMapOf<Int, Int>()
        val lvl = hashMapOf<TreeNode?, Int>()
        var mx = 0
        val sum = hashMapOf<Int, Int>()
        q.add(root)
        lvl[root] = 0
        val vis = hashMapOf<TreeNode?, Int>()
        while (q.isNotEmpty()) {
            val node = q.poll()
            vis[node] = 1
            mx = mx.coerceAtLeast(lvl[node]!!)
            sum[lvl[node]!!] = sum.getOrDefault(lvl[node], 0) + 1
            if (node?.left != null && vis[node.left] == null) {
                lvl[node.left] = lvl[node]!! + 1
                q.add(node.left)
            }

        }
        return sum[mx]!!
    }
}