package random

import com.sun.org.apache.xpath.internal.operations.Bool
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
class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) return true
        return isSymmetric(root.left, root.right)
    }

    private fun isSymmetric(root1: TreeNode?, root2: TreeNode?): Boolean {
        if (root1 == null || root2 == null) {
            return root1 == root2
        }

        return root1.`val` == root2.`val` && isSymmetric(root1.left, root2.right) && isSymmetric(
            root1.right,
            root2.left
        )

    }
}