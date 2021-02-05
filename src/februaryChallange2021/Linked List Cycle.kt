package februaryChallange2021

class Solution {
    var count = arrayListOf<ListNode>()
    fun hasCycle(head: ListNode?): Boolean {
       return  rec(head)
    }

    fun rec(node: ListNode?): Boolean {
        if (node == null) return false
        if (count.contains(node))
            return true
            count.add(node)
           return rec(node.next)
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}