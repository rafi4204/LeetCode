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
class Solution3 {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var cur = head
        var prv: ListNode? = ListNode(0)
        prv?.next = head
        var nHead = prv
        while (cur != null) {
            if (cur.`val` == `val`) {
                prv?.next = cur.next
                cur = cur?.next

            } else {
                prv = cur
                cur = cur.next
            }
        }
        return nHead?.next

    }
}