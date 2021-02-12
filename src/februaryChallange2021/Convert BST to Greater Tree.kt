package februaryChallange2021

import java.util.*

class Solution12 {
    val nodeList = TreeSet<Int>()
    val map = hashMapOf<Int,Int>()
    fun convertBST(root: TreeNode?): TreeNode? {
         bst(root)
        nodeList.forEach { it1->
            map[it1]=nodeList.filter { it>=it1 }.sum()
        }
        bst1(root)
        return root
    }
    fun bst(node: TreeNode?){
        if(node == null) return
        nodeList.add(node.`val`)
        bst(node.left)
        bst(node.right)
    }
    fun bst1(node: TreeNode?){
        if(node == null) return
        node.`val` = map[node.`val`]!!
        bst1(node.left)
        bst1(node.right)
    }
}