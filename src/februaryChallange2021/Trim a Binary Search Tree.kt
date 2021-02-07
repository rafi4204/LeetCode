package februaryChallange2021

class Solution3 {
    fun trimBST(root: TreeNode?, low: Int, high: Int): TreeNode? {
        bstTrimmer(root,low,high)
    }

    private fun bstTrimmer(node: TreeNode?, low: Int, high: Int) {
        if(node == null) return
        if(node.`val`<low || node.`val`>high)
            node.

    }
}
class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
    var right: TreeNode? = null
     }