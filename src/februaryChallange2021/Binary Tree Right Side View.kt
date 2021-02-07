package februaryChallange2021

class Solution4 {
    var nodes = mutableListOf<Int>()
    fun rightSideView(root: TreeNode?): List<Int> {
        rightView(root, 1)
        return nodes
    }


    private fun rightView(node: TreeNode?, i: Int) {
        if (node == null) return
        if (nodes.size < i)
            nodes.add(node.`val`)
        rightView(node.right, i + 1)
        rightView(node.left, i + 1)

    }
}
