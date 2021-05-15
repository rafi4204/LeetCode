package mayChallange2021

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
class Solution8 {
    private fun flatten(root: TreeNode?): Unit {
        if (root == null) return
        flatten(root.left)
        flatten(root.right)
        val temp = root.right
        root.right = root.left
        root.left = null
        var node = root
        while (node?.right != null)
            node = node.right
        node?.right = temp

    }
}