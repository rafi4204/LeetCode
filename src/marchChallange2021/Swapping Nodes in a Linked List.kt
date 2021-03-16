package marchChallange2021

class Solution12 {
    fun swapNodes(head: ListNode?, k: Int): ListNode? {

        val ar = mutableListOf<Int>()
        ar.add(head!!.`val`)
        var node = head.next

        while (node != null) {
            ar.add(node.`val`)
            node = node.next
       }
        val temp = ar[k - 1]
        ar[k - 1] = ar[ar.size - k]
        ar[ar.size - k] = temp

        var node1 = head.next

        head.`val` = ar[0]
        var j = 1

        while (node1 != null) {
            node1.`val` = ar[j]
            node1 = node1.next
            j++
        }
       return head
    }
}