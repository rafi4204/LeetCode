package linkedList

import januray2021Challange.ListNode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution4 {
    fun reverseList(head: ListNode?): ListNode? {
        var cur = head
        var prv:ListNode? = null
        while(cur!=null){
            val temp = cur.next
            cur.next = prv
            prv  = cur
            cur = temp
        }
        return prv
    }
}