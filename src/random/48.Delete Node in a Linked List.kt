package random

import februaryChallange2021.ListNode

class Solution48 {
    fun deleteNode(node: ListNode?) {
        var temp = node
        while (temp?.next != null) {
            temp.`val` = temp.next?.`val`!!
            if(temp?.next?.next==null)
                temp?.next = null
            temp = temp.next
        }

    }
}