package random

import februaryChallange2021.TreeNode
import kotlin.math.abs

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
class Solution9 {

    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) return true

        if (abs(traversal(root.left) - traversal(root.right)) > 1) return false
        return isBalanced(root.left) && isBalanced(root.right)
    }

    private fun traversal(node: TreeNode?): Int {
        if (node == null)
            return 0
        return 1 + Math.max(traversal(node.left), traversal(node.right))

    }
}

fun main() {
    val sol = Solution9()
    val tree = TreeNode(1)
    tree.left = null
    tree.right = TreeNode(2)
    tree?.right?.left = null
    tree?.right?.right = TreeNode(3)
    tree?.right?.right?.left = null
    tree?.right?.right?.right = null
    sol.isBalanced(tree)
}