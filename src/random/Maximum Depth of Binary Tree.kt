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
class Solution6 {
    var max = Int.MIN_VALUE
    fun maxDepth(root: TreeNode?): Int {
       depth(root,1)
        return max
    }

    private fun depth(node: TreeNode?, i: Int) {
       if(node==null){
           max = Math.max(i,max)
           return
       }
        depth(node.left,i+1)
        depth(node.right,i+1)
    }
}