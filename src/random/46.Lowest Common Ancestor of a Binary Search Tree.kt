package random

import februaryChallange2021.TreeNode

class Solution46 {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        var node: TreeNode? = null
        node = if (p?.`val`!! > root?.`val`!! && q?.`val`!! > root?.`val`) lowestCommonAncestor(root.right, p, q)
        else if (p.`val` < root?.`val` && q?.`val`!! < root?.`val`) lowestCommonAncestor(root.left, p, q)
        else
            root
        return node

    }
}