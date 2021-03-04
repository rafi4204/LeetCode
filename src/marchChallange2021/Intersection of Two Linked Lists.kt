package marchChallange2021

class Solution {
    val map = hashMapOf<ListNode, ListNode>()
    var result: ListNode? = null
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {

        traverseList(headA)
        traverseList(headB)
        return result
    }

    private fun traverseList(node: ListNode?) {
        if (node == null) return
        if (map[node] != null) {
            result = node
        }
        map[node] = node
        traverseList(node.next)
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}