package random

import februaryChallange2021.TreeNode

class Solution47 {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    if (root == null || p == root || q == root) return root
        val node2 = lowestCommonAncestor(root?.left, p, q)
        return lowestCommonAncestor(root?.right, p, q) ?: node2
    }
}