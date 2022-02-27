package februaryChallange2022

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
class Solution8 {
    var max_width = Int.MIN_VALUE
    val map = hashMapOf<Int, Int>()
    fun widthOfBinaryTree(root: TreeNode?): Int {
        maxWidth(root, 0, 1)
        return max_width
    }

    private fun maxWidth(node: TreeNode?, depth: Int, pos: Int) {
        if (node == null) return
        map.putIfAbsent(depth, pos)
        max_width = Math.max(max_width, pos - map[depth]!! + 1)
        maxWidth(node.left, depth + 1, pos * 2)
        maxWidth(node.right, depth + 1, pos * 2 + 1)

    }
}