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
class Solution10 {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var cur = head

        var next = head
        var i = 0
        while (i < n ) {
            next = next?.next
            i++
        }
        if (next == null)
            return head?.next
        while (next?.next != null) {

            cur = cur?.next
            next = next.next


        }
        cur?.next = cur?.next?.next

        return head
    }
}