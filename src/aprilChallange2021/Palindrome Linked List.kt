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
class Solution {
    fun isPalindrome(node: ListNode?): Boolean {
        var head = node
        val ar = arrayListOf<Char>()
        ar.add(head?.`val`!!.toChar())
        while (head?.next != null) {
            head = head.next
            ar.add(head?.`val`!!.toChar())

        }
        return ar.toArray().joinToString("") == ar.toArray().joinToString("").reversed()


    }


}

fun main() {
    val sol = Solution()
    val node = ListNode(1)
    node.next = ListNode(2)
    node.next!!.next = ListNode(2)
    node.next!!.next?.next = ListNode(1)
    sol.isPalindrome(node)
}