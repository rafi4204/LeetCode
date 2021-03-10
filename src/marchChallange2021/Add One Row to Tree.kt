package marchChallange2021

class Solution8 {
    fun addOneRow(root: TreeNode?, v: Int, d: Int): TreeNode? {
        if (d == 1) {
            val res = TreeNode(v)
            res.left = root
            return res
        }
        traverseTree(root, 1, v, d - 1)
        return root

    }

    private fun traverseTree(node: TreeNode?, level: Int, v: Int, d: Int) {
        if (node == null) return
        if (level == d) {
            val newLeft = TreeNode(v)
            val newRight = TreeNode(v)
            if (node.left != null)
                newLeft.left = node.left
            if (node.right != null)
                newRight.right = node.right
            node.left = newLeft
            node.right = newRight

        }

        traverseTree(node.left, level + 1, v, d)
        traverseTree(node.right, level + 1, v, d)

    }
}

/*
class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
         var right: TreeNode? = null
     }*/
