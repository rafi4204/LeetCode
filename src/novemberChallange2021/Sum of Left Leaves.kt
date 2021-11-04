package novemberChallange2021

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
class Solution3 {
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        return sumOfLeft(root, 0,3)

    }

    private fun sumOfLeft(node: TreeNode?, value: Int, i: Int): Int {
        if (node == null)
            return 0
        if (node.left == null && node.right == null&&(i==1||i==2))
            return value + node.`val`


        return value + sumOfLeft(node?.left, value, 2)+sumOfLeft(node?.right, value, 3)
    }
}