package random

import februaryChallange2021.TreeNode

class Solution24 {
    fun invertTree(root: TreeNode?): TreeNode? {
        invert(root)
        return root
    }

    private fun invert(node: TreeNode?) {
        if (node == null) return
        val temp = node.left
        node.left = node.right
        node.right = temp
        invert(node.left)
        invert(node.right)
    }
}