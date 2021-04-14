package aprilChallange2021

import marchChallange2021.ListNode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution8 {
    fun partition(head: ListNode?, x: Int): ListNode? {
        val list = arrayListOf<ListNode>()
        var node = head
        var tempHead = head
        var prv: ListNode? = null
        if(head == null)
            return head
        while (node != null) {
            if (node.`val` < x) {
                list.add(node)
                if (prv != null)
                    prv.next = node.next
                if (prv == null) {
                    tempHead = node.next
                }


            } else {
                prv = node

            }
            node = node.next

        }
        if(list.isEmpty())
            return head
        node = list.first()
        val nodeHead = node
        for (i in 1 until list.size) {
            node?.next = list[i]
            node = list[i]
        }
        list.last().next = tempHead
        return nodeHead

    }
}