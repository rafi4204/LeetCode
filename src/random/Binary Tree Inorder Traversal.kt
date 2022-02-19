package random

import apple.laf.JRSUIUtils.Tree
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
class Solution4 {
    val res = arrayListOf<Int>()
    fun inorderTraversal(root: TreeNode?): List<Int> {
        inorder(root)
        return res
    }

    private fun inorder(node: TreeNode?) {
        if(node==null) return

        inorder(node.left)
        res.add(node.`val`)
        inorder(node.right)

    }
}

fun main(){
    val sol = Solution4()
    var tree = TreeNode(1)
    tree.left = null
    tree.right = TreeNode(5)
    tree.right?.left = TreeNode(3)
    tree.right?.right = null
    sol.inorderTraversal(tree)
}