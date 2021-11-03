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
class Solution2 {
    fun sumNumbers(root: TreeNode?): Int {
        return sumOfNodes(root, 0)
    }

    fun sumOfNodes(node: TreeNode?, value: Int): Int {
        if (node == null)
            return 0
        if (node.left == null && node.right == null)
            return (value * 10) + node.`val`
        return sumOfNodes(node.left, (value * 10) + node.`val`) + sumOfNodes(node.right, (value * 10) + node.`val`)
    }


}