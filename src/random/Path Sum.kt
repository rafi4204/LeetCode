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
class Solution13 {
    var ans = false
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        pathSum(root, targetSum, 0)
        return ans
    }

    private fun pathSum(node: TreeNode?, targetSum: Int, value: Int) {

        if (node?.left == null && node?.right == null) {
            if (node?.`val`?.plus(value) == targetSum)
                ans = true

            return
        }
        pathSum(node.left, targetSum, node.`val` + value)
        pathSum(node.right, targetSum, node.`val` + value)

    }
}