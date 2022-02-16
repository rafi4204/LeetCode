package februaryChallange2022

import januray2021Challange.ListNode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */ fun swapPairs(head: ListNode?): ListNode? {
    val res= head?.next
    val resHead = head
    var next = head?.next
    var prv = head
    var first = ListNode(0)

    while (next != null && prv != null) {

        val temp = next.next
        next.next = prv
        prv.next = temp
        first.next = next
        first = prv
        prv = prv.next
        next = prv?.next

    }
    return if (res == null) resHead else res
}
class Solution2 {

}

fun main(){
    val sol = Solution2()
    val res = ListNode(1)
    res.next = ListNode(2)
    res.next?.next = ListNode(3)
    res.next?.next?.next = ListNode(4)
    //sol.swapPairs(res)
}