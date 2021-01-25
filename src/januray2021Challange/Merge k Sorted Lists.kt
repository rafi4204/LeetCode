package januray2021Challange

class Solution3 {
    var valList = arrayListOf<Int>()
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        lists.forEach { dfs(it) }
        valList.sort()
        if(valList.size == 0){
            val li :ListNode? = null
            return li
        }
        val finalList = ListNode(valList.first())
        finalListMaker(finalList, 1)
        return finalList
    }

    private fun finalListMaker(node: ListNode?, i: Int) {
        if (i >= valList.size) {
            node?.next = null
            return
        }
        node?.next = ListNode(valList[i])
        finalListMaker(node?.next, i + 1)
    }

    private fun dfs(node: ListNode?) {
        if (node == null)
            return
        valList.add(node.`val`)
        dfs(node.next)
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

/*
fun main(){
    var sol = Solution3()
    sol.mergeKLists([[1,4,5],[1,3,4],[2,6]])
}*/
