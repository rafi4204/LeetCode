package februaryChallange2021

class Solution10 {

    fun copyRandomList(node: Node?): Node? {
        val copyNode = node?.`val`?.let { Node(it) }
        nodeList(node, copyNode)
        return copyNode
    }

    fun nodeList(node: Node?, copyNode: Node?) {
        if (node == null)
            return
        val node = Node(node.`val`)
        nodeList(node.next, node.next)
        nodeList(node.random, node.random)

    }

}

class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}