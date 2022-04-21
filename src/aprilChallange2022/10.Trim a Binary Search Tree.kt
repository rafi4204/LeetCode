package aprilChallange2022

import februaryChallange2021.TreeNode

class Solution10 {
    fun trimBST(root: TreeNode?, low: Int, high: Int): TreeNode? {
        return trim(root, low, high)
    }

    private fun trim(node: TreeNode?, low: Int, high: Int): TreeNode? {
        if (node == null) return null
        if (node.`val` > high) return node.left
        if (node.`val` < low) return node.right

        node.left = trim(node.left, low, high)
        node.right = trim(node.right, low, high)
        return node
    }
}