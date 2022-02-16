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
class Solution1 {
    fun deleteMiddle(head: ListNode?): ListNode? {

        var slow = head
        if (head?.next == null)
            return head?.next

        var fast = head?.next?.next
        while (fast != null) {

            if (fast?.next != null)
                slow = slow?.next
            fast = fast.next?.next

        }
        slow?.next = slow?.next?.next
        return head
    }
}