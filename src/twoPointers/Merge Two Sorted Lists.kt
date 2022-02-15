package twoPointers

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
class Solution10 {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var res = ListNode(0)
        val head = res
        var cur1 = list1
        var cur2 = list2
        while (cur1 != null && cur2 != null) {
            if (cur1.`val` <= cur2.`val`) {
                res.next = cur1
                cur1 = cur1.next
            } else {
                res.next = cur2
                cur2 = cur2.next
            }
            res = res.next!!

        }
        if (cur1 == null) {
            while (cur2 != null) {
                res.next = cur2
                cur2 = cur2.next
            }

        } else if (cur2 == null) {
            while (cur1 != null) {
                res.next = cur1
                cur1 = cur1.next
            }
        }

        return head.next
    }
}