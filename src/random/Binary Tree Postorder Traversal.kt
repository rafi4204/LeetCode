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
class Solution12 {
    val res = arrayListOf<Int>()
    fun postorderTraversal(root: TreeNode?): List<Int> {
        postOrder(root)
        return res
    }

    private fun postOrder(node: TreeNode?) {
        if(node==null) return
        postOrder(node.left)
        postOrder(node.right)
        res.add(node.`val`)
    }
}