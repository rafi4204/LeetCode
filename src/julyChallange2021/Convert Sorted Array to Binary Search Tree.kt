package julyChallange2021

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
class Solution5 {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {

        return buildTree(0, nums.size - 1, nums)

    }

    private fun buildTree(i: Int, j: Int, nums: IntArray): TreeNode? {
        if (i > j) return null
        val treeNode = TreeNode(nums[(i + j) / 2])

        treeNode.left = buildTree(i, ((i + j) / 2) - 1, nums)
        treeNode.right = buildTree(((i + j) / 2) + 1, j, nums)

        return treeNode


    }
}