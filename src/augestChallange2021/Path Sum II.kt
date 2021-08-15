package augestChallange2021

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
class Solution3 {
    val res = arrayListOf<ArrayList<Int>>()
    fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {

        travarseTree(root, 0, targetSum, "")
        return res
    }

    private fun travarseTree(node: TreeNode?, sum: Int, targetSum: Int, list: String) {
        if (node == null)
            return

        travarseTree(node.left, sum + node.`val`, targetSum, list+","+node.`val`.toString())
        travarseTree(node.right, sum + node.`val`, targetSum, list+","+node.`val`.toString())
        if (sum + node.`val` == targetSum&&node.left == null && node.right == null) {
            val ar = arrayListOf<Int>()
            list.split(",").forEach {
                if(!it.isEmpty())
                    ar.add(it.toInt())
            }
            ar.add(node.`val`)
            res.add(ar)
        }

    }
}