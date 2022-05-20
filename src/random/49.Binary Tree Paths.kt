package random

import februaryChallange2021.TreeNode

class Solution49 {
    val res = arrayListOf<String>()
    fun binaryTreePaths(root: TreeNode?): List<String> {
        traverse(root, "")
        return res
    }

    private fun traverse(node: TreeNode?, s: String) {
        if (node == null) return
        if (node.left == null && node.right == null) {
            res.add(s + node.`val`.toString())
            return
        }
        traverse(node.left, s + node.`val`.toString() + "->")
        traverse(node.right, s + node.`val`.toString() + "->")
    }
}