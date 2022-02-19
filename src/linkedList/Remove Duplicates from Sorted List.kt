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
class Solution2 {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var prv = head
        var cur = head?.next
        while (cur != null) {
            if (prv?.`val` == cur.`val`) {
                prv.next = cur.next
                //  prv = cur?.next
                cur = cur?.next
            } else{
                prv = prv?.next
                cur = cur?.next
            }

        }
        return head
    }
}