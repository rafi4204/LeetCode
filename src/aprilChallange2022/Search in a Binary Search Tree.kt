package aprilChallange2022

import februaryChallange2021.TreeNode

class Solution8 {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        return root?.let { searchNode(it, `val`) }
    }

    private fun searchNode(node: TreeNode, value: Int): TreeNode? {
        if (node.`val` == value) return node
        return if (node.`val` > value) node.left?.let { searchNode(it, value) }
        else node.right?.let { searchNode(it, value) }
    }
}