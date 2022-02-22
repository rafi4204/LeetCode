package random

import februaryChallange2021.TreeNode

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
class Solution11 {
    val res = arrayListOf<Int>()
    fun preorderTraversal(root: TreeNode?): List<Int> {
        preOrder(root)
            return res
    }

    private fun preOrder(node: TreeNode?) {
        if(node==null) return
        res.add(node.`val`)
        preOrder(node.left)
        preOrder(node.right)
    }
}