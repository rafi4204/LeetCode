package random

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
class Solution5 {
    var pStr = ""
    var qStr = ""
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        inOrderP(p)
        inOrderQ(q)
        return pStr == qStr
    }

    private fun inOrderP(p: TreeNode?) {
        if (p == null) {
            pStr += 'n'
            return
        }
        pStr += p.`val`.toString()
        inOrderP(p.left)
        inOrderP(p.right)

    }

    private fun inOrderQ(q: TreeNode?) {
        if (q == null) {
            qStr += 'n'
            return
        }
        qStr += q.`val`.toString()
        inOrderQ(q.left)
        inOrderQ(q.right)

    }
}

fun main(){
    val sol = Solution5()
    var tree1 = TreeNode(1)
    tree1.left = TreeNode(1)
    tree1.right = null
    var tree2 = TreeNode(1)
    tree2.left = null
    tree2.right = TreeNode(1)

    sol.isSameTree(tree1,tree2)
}