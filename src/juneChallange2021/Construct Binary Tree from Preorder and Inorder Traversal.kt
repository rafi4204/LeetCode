package juneChallange2021

import marchChallange2021.TreeNode

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
    val map = hashMapOf<Int,Int>()
    var index = 0

    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
       for(i in inorder.indices)
           map[inorder[i]] = i
          return constructTree(0,inorder.size-1,preorder)
    }

    private fun constructTree(left: Int, right: Int, preorder: IntArray) : TreeNode? {
        if(left>right) return null
        val mid = map[preorder[index]]!!
        val root = TreeNode(preorder[index++])
        root.left = constructTree(left,mid-1,preorder)
        root.right = constructTree(mid+1,right,preorder)

       return root
    }
}