package aprilChallange2021

import marchChallange2021.TreeNode

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution7 {
    var mx = -1
    val map = hashMapOf<Int, Int>()
    fun deepestLeavesSum(root: TreeNode?): Int {
        dfs(root, 1)
        return map[mx]!!

    }

    private fun dfs(node: TreeNode?, i: Int) {
        if (node == null)
            return
        mx = Math.max(mx, i)
        map[i] = if (map[i] == null) node.`val` else map[i]!! + node.`val`
        dfs(node.left, i + 1)
        dfs(node.right, i + 1)
    }
}