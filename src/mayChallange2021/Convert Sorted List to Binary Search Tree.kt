package mayChallange2021

import marchChallange2021.ListNode
import marchChallange2021.TreeNode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
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
    fun sortedListToBST(head: ListNode?): TreeNode? {
        var cur = head
        val ar = arrayListOf<Int>()
        var treeHead: TreeNode

        while (cur != null) {
            ar.add(cur.`val`)
            cur = cur.next
        }
        if (ar.size == 1)
            return TreeNode(ar[0])
        if (ar.size == 0)
            return null
        if (ar.size == 2) {
            treeHead = TreeNode(ar[0])
            treeHead.right = TreeNode(ar[1])
            return treeHead
        }
        val i = ar.size / 2
        var l = i - 1
        var r = i + 1
        treeHead = TreeNode(ar[i])
        var leftTree: TreeNode? = treeHead
        var rightTree: TreeNode? = treeHead


        while (l in ar.indices || r in ar.indices) {
            if (l in ar.indices) {
                leftTree?.left = TreeNode(ar[l])
                leftTree = leftTree?.left
                l--
            }
            if (r in ar.indices) {
                rightTree?.right = TreeNode(ar[r])
                rightTree = rightTree?.right
                r++
            }
        }
        return treeHead
    }
}