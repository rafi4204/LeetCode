package mayChallange2021


import marchChallange2021.TreeNode

class Solution10 {
    var cnt1 = 0

    val map = hashMapOf<TreeNode?, Int>()
    fun minCameraCover(root: TreeNode?): Int {
        map[null] = 0
        tree(root, null)

        return cnt1
    }

    private fun tree(root: TreeNode?, parent: TreeNode?) {
        if (root == null) return
        tree(root.right, root)
        tree(root.left, root)
        if (parent == null && map[root] == null || map[root.right] == null || map[root.left] == null) {
            cnt1++
            map[root] = 0
            map[root.right] = 0
            map[root.left] = 0
            map[parent] = 0
        }


    }
}