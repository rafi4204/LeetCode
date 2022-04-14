package random

import februaryChallange2021.TreeNode

class Solution28 {
    fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? {
        if(root == null)
            return TreeNode(`val`)
        insert(root, `val`)
        return root
    }

    private fun insert(node: TreeNode?, value: Int) {

        if (value > node!!.`val`) {
            if (node.right == null) {
                node.right = TreeNode(value)
                return
            }
            insert(node.right, value)
        } else {
            if (node.left == null) {
                node.left = TreeNode(value)
                return
            }
            insert(node.left, value)
        }
    }
}