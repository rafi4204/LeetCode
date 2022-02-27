package februaryChallange2022



  class Node(var `val`: Int) {
      var neighbors: ArrayList<Node?> = ArrayList<Node?>()
 }


class Solution7 {
    fun cloneGraph(node: Node?): Node? {
        var res: Node? = Node(0)
        travarse(node, res)
        return res
    }

    private fun travarse(node: Node?, res: Node?) {
        if (node == null) return
        res?.`val` = node.`val`
        var i = 0
        res?.neighbors = ArrayList<Node?>(node?.neighbors?.size!!)
        while (i < node.neighbors.size) {
            res?.neighbors?.add(Node(0))
            travarse(node.neighbors[i], res?.neighbors?.get(i))
            i++
        }

    }
}

fun main(){
    
}