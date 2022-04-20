package aprilChallange2022

import februaryChallange2021.TreeNode

class Solution9 {
    fun increasingBST(root: TreeNode?): TreeNode? {
       return inOrderBst(root)
    }

    private fun inOrderBst(node: TreeNode?): TreeNode? {
        if(node==null) return null
       val temp = inOrderBst(node.left)
        temp?.right = TreeNode(node.`val`)
        temp?.right?.right = node.right
        inOrderBst(node.right)
        return node.right

    }
}