package random

import apple.laf.JRSUIUtils.Tree
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
class Solution10 {
    fun minDepth(root: TreeNode?): Int {
      return height(root)
    }

    fun height(node: TreeNode?): Int {
        if (node == null) return 0
        if (node?.left == null && node?.right == null) return 1
        if (node.left == null) return 1 + height(node.right)
        if (node.right == null) return 1 + height(node.left)
        return 1 + Math.min(height(node.left), height(node.right))
    }
}