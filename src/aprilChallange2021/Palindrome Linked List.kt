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
        var s = ""
        var head = node
        s = head?.`val`.toString()
        while (head?.next != null) {
            head = head.next
            s += head?.`val`.toString()
        }

        return findPalindrome(s)

    }


    fun findPalindrome(s: String): Boolean {
        var i = 0
        var j = 0
        if (s.length % 2 == 0) {
            i = s.length / 2 - 1
            j = i + 1
        } else {
            i = s.length / 2
            j = i
        }

        while (i in s.indices && j in s.indices) {
            if (s[i] == s[j]) {
                i--
                j++
            } else
                break
        }
        return i == -1 && j == s.length
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